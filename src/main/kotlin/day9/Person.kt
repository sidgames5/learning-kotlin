package day9

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