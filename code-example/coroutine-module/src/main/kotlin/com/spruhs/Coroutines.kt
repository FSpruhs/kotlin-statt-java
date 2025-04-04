package main.kotlin.com.spruhs

import kotlinx.coroutines.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.concurrent.atomic.AtomicInteger

fun coroutineTest() {
    val latch = CountDownLatch(10_000)
    val counter = AtomicInteger()

    val start = System.currentTimeMillis()
    runBlocking {
        for (i in 1..10_000) {
            launch {
                counter.incrementAndGet()
                delay(100)
                counter.incrementAndGet()
                latch.countDown()
            }
        }
    }

    latch.await(20, TimeUnit.SECONDS)

    println("Execution time: ${System.currentTimeMillis() - start} ms, Counter: ${counter.get()/2}")
}

fun threadTest(threadPoolSize: Int) {
    val counter = AtomicInteger()

    val pool = Executors.newFixedThreadPool(threadPoolSize)
    val start = System.currentTimeMillis()
    for (i in 1..10_000) {
        pool.submit {
            counter.incrementAndGet()
            Thread.sleep(100)
            counter.incrementAndGet()
        }
    }

    pool.shutdown()
    pool.awaitTermination(20, TimeUnit.SECONDS)

    println("ThreadPoolSize: $threadPoolSize, execution time: ${System.currentTimeMillis() - start} ms, Counter: ${counter.get()/2}")
}

fun main() {
    coroutineTest()
    listOf(1, 10, 50, 100, 1_000, 2_500, 5_000, 10_000).forEach {
        threadTest(it)
    }
}