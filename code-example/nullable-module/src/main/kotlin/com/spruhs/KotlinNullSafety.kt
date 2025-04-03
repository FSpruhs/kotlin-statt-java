package main.kotlin.com.spruhs

class KotlinNullSafety {
    fun testNullSafety() {
        var nullableVariable: String?
        var nonNullableVariable: String

        nullableVariable = null // Kein Compiler Fehler
        //nonNullableVariable = null // Compiler Fehler
    }
}