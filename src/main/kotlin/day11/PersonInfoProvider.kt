package day11

interface PersonInfoProvider {
    val providerInfo:String

    fun printInfo(person:Person) {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider {
    fun getSessionId():String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider {
    override val providerInfo = "BasicInfoProvider"

    protected open val sessionIdPrefix = "Session"
    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

class OtherInfoProvider : PersonInfoProvider {
    override val providerInfo = "OtherInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }
}
