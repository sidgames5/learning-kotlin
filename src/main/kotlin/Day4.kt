// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 32:51

fun getGreeting():String {
    return "Good morning"
}

fun sayHello() {
    println("Hello!")
}

fun getMessage() = "Secret message"

fun greet(name:String) {
    println("${getGreeting()} $name!")
}

fun main() {
    println("${getGreeting()} sid!")
    sayHello()
    println(getMessage())
    greet("kotlin")
}