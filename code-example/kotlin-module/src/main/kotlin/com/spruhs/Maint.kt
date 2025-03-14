package main.kotlin.com.spruhs

fun main() {
    val javaClassMethodGreeter = JavaClassMethodGreeter()
    javaClassMethodGreeter.greet()

    JavaStaticGreeter.greet()
}