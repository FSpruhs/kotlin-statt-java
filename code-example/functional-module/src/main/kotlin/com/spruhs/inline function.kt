package main.kotlin.com.spruhs

inline fun transformString(
    input: String,
    transform: (String) -> String
): String {
    return transform(input)
}

fun main() {
    val result = transformString("Hello, World!") { it.uppercase() }
    println(result) // Ausgabe: HELLO, WORLD!
}