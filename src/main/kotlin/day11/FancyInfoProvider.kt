package day11

class FancyInfoProvider : BasicInfoProvider() {
    override val providerInfo: String
        get() = "Fancy Info Provider"

    override val sessionIdPrefix: String
        get() = "Fancy Session"

    override fun printInfo(person: Person) {
        super.printInfo(person)

        println("Fancy Info")
    }
}