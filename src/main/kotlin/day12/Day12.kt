package day12

// https://www.youtube.com/watch?v=F9UC9DY-vIU
// left off at 2:04:29

fun main() {
//    val student1 = Person("Jane", "Doe", 18)
//    greet(name = student1.firstName)
//    val student2 = Person()
//    greet(name = student2.firstName)
//    student1.nickname = "Jane the lame"
//    println(student1.nickname)
//    student1.printInfo()
//    student2.printInfo()
//
//    val provider = BasicInfoProvider()
//    provider.printInfo(student1)
//    provider.printInfo(Person())
//    OtherInfoProvider().printInfo(student2)
//    println(provider.getSessionId())
//    checkTypes(provider)
//    checkTypes(OtherInfoProvider())
//
    val newProvider = object : PersonInfoProvider {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSessionId() = "id"
    }
    println(newProvider.getSessionId())

    test()
}