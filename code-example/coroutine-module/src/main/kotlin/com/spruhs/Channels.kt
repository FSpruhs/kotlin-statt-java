package main.kotlin.com.spruhs

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun channelsExample() = runBlocking {
    val channel = Channel<Int>()

    launch {
        for (x in 1..5) {
            println("Send $x")
            channel.send(x)
        }
        channel.close()
    }

    launch {
        for (y in channel) {
            println("Receive $y")
        }
    }
}

fun main() {
    channelsExample()
}