package day5

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 45:22

fun sayHello(greeting:String, name:String) {
    println("$greeting $name")
}

fun main() {
    val things = arrayOf("Kotlin", "Programming", "Books")
    println(things.size)
    println(things[1])
    println(things.get(0))

    for (thing in things) {
        println(thing)
    }

    things.forEach { thing ->
        println(thing)
    }

    things.forEachIndexed { index, thing -> println("$thing is at $index") }

    val list = listOf("Tennis", "Soccer", "Track")
    list.forEach { item -> println(item) }

    val activities = mapOf("morning" to "tennis", "afternoon" to "programming", "evening" to "movies")
    activities.forEach { time, activity -> println("$activity during $time") }
}