package day2// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 15:00

val name = "Sid"
var greeting:String? = "Hello"

fun main() {
    println("$greeting $name")

    greeting = null

    println("$greeting $name")

    greeting = "Good afternoon"

    println("$greeting $name")
}