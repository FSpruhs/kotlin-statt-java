package main.kotlin.com.spruhs

fun String.double(): String {
    return "$this $this"
}

fun main() {
    val name = "Hello World!".double()
    println(name.double()) // Output: Hello World! Hello World! Hello World! Hello World!
}