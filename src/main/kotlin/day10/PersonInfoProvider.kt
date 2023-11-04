package day10

interface PersonInfoProvider {
    val providerInfo:String

    fun printInfo(person:Person) {
        println(providerInfo)
        person.printInfo()
    }
}

class BasicInfoProvider : PersonInfoProvider {
    override val providerInfo = "BasicInfoProvider"
}

class OtherInfoProvider : PersonInfoProvider {
    override val providerInfo = "OtherInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }
}