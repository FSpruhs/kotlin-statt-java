package main.java.com.spruhs

class ClassGreeter {
    fun greet() {
        println("Hello from kotlin class method!")
    }
}

class StaticGreeter {
    companion object {

        @JvmStatic
        fun greet() {
            println("Hello from kotlin static method!")
        }
    }
}

object SingletonGreeter {
    fun greet() {
        println("Hello from kotlin singleton method!")
    }
}