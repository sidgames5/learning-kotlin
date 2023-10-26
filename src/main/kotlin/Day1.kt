// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at

var topLevelVariable:String = "this is a top level variable"

fun main() {
    val name:String = "Sid";
    println("Hello $name!")
    var text:String = "Text"
    // this can be changed
    text = "Test"
    // name cannot be changed
    println(text)
    println(topLevelVariable)
    var greeting = "Good morning"
    println("$greeting, $name!")
    greeting = "Good afternoon"
    println("$greeting, $name!")
}