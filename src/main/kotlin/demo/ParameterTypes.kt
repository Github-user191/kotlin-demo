package demo

fun greet(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

fun greetPerson(greeting: String, name: String = "John") = println("$greeting $name")


fun main() {

    // VARARG Parameters - represents a variable number of arguments to a function, can be 0 arguments or as many as required and are treated as an array
    val interestingThings = arrayOf("Apples", "Pears", "Grapes")


    greet("Hello")
    greet("Hello", "Apples", "Pears", "Grapes")

    // To pass in an existing array collection we need to add the spread operator to the array variable
    greet("Hello", *interestingThings)

    // NAMED ARGUMENTS - We can explicitly indicate which argument represents what by using the following syntax
    // We can also mix up the order of the arguments / function signature this way
    greetPerson(greeting = "hi", name = "Nate")
    greetPerson(greeting = "hi")
    
}