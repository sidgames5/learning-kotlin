package day7

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 1:00:26

fun sayHello(greeting:String, vararg names:String) {
    names.forEach { name -> println("$greeting $name") }
}

fun greet(greeting:String = "hi", name:String = "sid") = println("$greeting $name")

fun main() {
    greet(name = "kotlin", greeting = "hello")
    greet(name = "kotlin")
    greet(greeting = "hello")
    greet()
}