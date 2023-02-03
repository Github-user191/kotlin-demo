package demo

fun main() {
    println(getGreeting())
    testNullableValue()
    testParameters1("John")
    testParameters2("John", "Doe")
}

fun getGreeting(): String {
    return "Hello Kotlin"
}

// Using single expression function, we can remove the explicit return type also
fun testExpressionFunction() = "Hello Java"

// vs regular function with implicit return type
fun regularFunction(): String {
    return "Hello Java"
}


// We can specify a return value to be nullable in functions
fun testNullableValue(): String? {
    return null
}

fun testParameters1(name: String) {
    println("Hello $name")
}

fun testParameters2(name:String, surname:String) = println("Hello $name $surname")