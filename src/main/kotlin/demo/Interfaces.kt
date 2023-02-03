package demo

interface PersonInfoProvider {
    val providerInfo: String

    // Default implementation method within the interface
    fun printInfo() {
        println(providerInfo)
    }

    fun printInfo(name: String)
}

interface SessionInfoProvider {
    fun getSessionId(): String
}


// Implementing multiple interfaces
// Allowing other base classes to inherit from FUNCTIONS AND PROPERTIES BasicInfoProvider using the "open" keyword
open class BasicInfoProvider() : PersonInfoProvider, SessionInfoProvider {

    // Overriding property from interface
    override val providerInfo: String
        get() = "BasicInfoProvider"

    // Marking as protected to avoid being able to access it from NON-SUBCLASSES
    protected open val sessionIdPrefix = "Session"

    // OVERRIDE keyword to indicate we are overriding method from Interface
    override fun printInfo(name: String) {
        println("Printing info: $name")
    }

    // Overriding the default function and adding additional functionality
    override fun printInfo() {
        super.printInfo()
        println("Adding onto the default function implementation")
    }

    // Overriding function from second Interface
    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

// Typecasting
// "is" keyword is similar to instanceof in Java
// "as" keyword is used to cast something to a different type
fun checkTypes(infoProvider: PersonInfoProvider) {
    if(infoProvider is SessionInfoProvider) {
        println("is a session info provider")
        // Typecasting instance to SessionInfoProvider Interface and calling SessionInfoProvider methods on it
        (infoProvider as SessionInfoProvider).getSessionId()
    } else {
        println("is a person info provider")
    }

}


fun main() {
    val provider = BasicInfoProvider()
    provider.printInfo("James")
    provider.printInfo()

    // provider.sessionIdPrefix -> Won't work because sessionIdPrefix is defined as a protected variable
    println(provider.getSessionId())

    // Since provider object implements both Session and Person Provider, provider is an instance of SessionInfoProvider too
    checkTypes(provider)

}