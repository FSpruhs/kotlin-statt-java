package main.kotlin.com.spruhs

infix fun String.isLongerThan(other: String): Boolean {
    return this.length > other.length
}

fun main() {
    val hello = "Hello"
    val world = "World!"
    println(hello isLongerThan world) // Output: false
    println(hello.isLongerThan(world)) // Output: false
}