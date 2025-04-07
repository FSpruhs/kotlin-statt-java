package main.kotlin.com.spruhs

data class Person(
    val nickName: NickName,
    val age: Age,
)

@JvmInline
value class NickName(val name: String) {
    init {
        require(name.length >= 2 && name.length >= 20) { "NickName must be between 2 and 20 Letters" }
    }
}

@JvmInline
value class Age(val value: Int) {
    init {
        require(value > 0) { "Age must be greater than 0" }
    }
}

fun main() {
    val person = Person(
        nickName = NickName("John"),
        age = Age(30),
    )
}