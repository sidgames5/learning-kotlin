package day8

class Person(_firstName:String, _lastName:String, age:Int) {
    val firstName:String
    val lastName:String

    init {
        this.firstName = _firstName
        this.lastName = _lastName
    }
}