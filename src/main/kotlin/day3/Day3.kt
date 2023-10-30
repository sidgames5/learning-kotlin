package day3// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 21:31

fun main() {
    val name = "Sid"
    var greeting:String? = null

    if (greeting != null) {
        println("$greeting $name")
    } else {
        println("Hi $name")
    }

    greeting = "Good morning"

    when (greeting) {
        null -> println("I don't know the time")
        "Good morning" -> println("The time is morning")
        "Good afternoon" -> println("The time is afternoon")
        "Good evening" -> println("The time is evening")
        else -> println(greeting)
    }

    var otherGreeting = if (greeting != null) greeting else "Hello"

    println("$otherGreeting $name")

    greeting = null

    otherGreeting = if (greeting != null) greeting else "Hello"

    println("$otherGreeting $name")
}