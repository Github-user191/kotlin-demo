package demo

class FancyInfoProvider: BasicInfoProvider() {

    override val sessionIdPrefix: String
        get() = "Fancy Session ID Prefix"

    // Overriding "providerInfo" property from BasicInfoProvider
    override val providerInfo: String
        get() = "Fancy Info Provider"

    override fun printInfo(name: String) {
        super.printInfo(name)
        println("Fancy Info printInfo() method()")
    }

}