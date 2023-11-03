package day9

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 1:16:52

fun sayHello(greeting:String, vararg names:String) {
    names.forEach { name -> println("$greeting $name") }
}

fun greet(greeting:String = "hi", name:String = "sid") = println("$greeting $name")

fun main() {
    val student1 = Person("Jane", "Doe", 18)
    greet(name = student1.firstName)
    val student2 = Person()
    greet(name = student2.firstName)
    student1.nickname = "Jane the lame"
    println(student1.nickname)
}