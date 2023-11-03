package day8

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 1:06:41

fun sayHello(greeting:String, vararg names:String) {
    names.forEach { name -> println("$greeting $name") }
}

fun greet(greeting:String = "hi", name:String = "sid") = println("$greeting $name")

fun main() {
    var student1 = Person("John", "Doe", 18)
    greet(name = student1.firstName)
}