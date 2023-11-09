package day14_1

class Person(val firstName:String = "Bob", val lastName:String = "Doe", val age:Int = 0) {
    var nickname:String? = null
        set(value) {
            field = value
            println(value)
        }
        get() {
            println(field)
            return field
        }

    fun printInfo() {
        val nn = nickname ?: "no nickname"
        println("Name: $firstName ($nn) $lastName")
        println("Age: $age")
    }

    init {
        println("init 1")
    }
    constructor(): this("John", "Doe", 0) {
        println("secondary constructor")
    }

    init {
        println("init 2")
    }
}