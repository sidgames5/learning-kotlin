package day6

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 49:22

fun sayHello(greeting:String, names:List<String>) {
    names.forEach { name -> println("$greeting $name") }
}

fun main() {
    val things = mutableListOf("Kotlin", "Programming", "Books")
    things.add("Walking")

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4, "d")

    sayHello("Hi", things)
}