package main.kotlin.com.spruhs

class User(
    val firstName: String = "",
    val lastName: String = "",
    val titles: List<String> = emptyList(),
    val age: Int? = null,
)

fun main() {
    val user1 = User(
        firstName = "John",
        lastName = "Doe",
        titles = listOf("Mr.", "Dr."),
        age = 30,
    )

    val user2 = User(
        firstName = "Jane",
        lastName = "Smith",
    )
}
