package main.kotlin.com.spruhs

fun String.repeat(): String {
    return "$this $this"
}

fun main() {
    val name = "Hello World!".repeat()
    println(name.repeat()) // Output: Hello World! Hello World! Hello World! Hello World!
}