package main.kotlin.com.spruhs

fun getUserName(user: KotlinUser?): String {
    return user?.name ?: "Unbekannter Benutzer"
}

data class KotlinUser(val name: String)

fun main() {
    val user1: KotlinUser = KotlinUser("Fabian")
    val user2: KotlinUser? = null

    println(getUserName(user1)) // Ausgabe: Fabian
    println(getUserName(user2)) // Ausgabe: Unbekannter Benutzer
}