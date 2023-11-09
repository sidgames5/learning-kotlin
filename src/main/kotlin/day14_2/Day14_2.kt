package day14_2

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// finished

fun printFilteredStrings(list:List<String>, predicate:((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) println(it)
    }
}

val predicate:(String) -> Boolean = {
    it.startsWith("H");
}

fun getPrintPredicate():(String) -> Boolean {
    return { it.startsWith("H") }
}

fun main() {
    val list = listOf("Kotlin", "Java", "Haxe", "HTML")
    printFilteredStrings(list, getPrintPredicate())
    printFilteredStrings(list, null)
}