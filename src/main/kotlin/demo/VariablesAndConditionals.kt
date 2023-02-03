package demo

// Declaring top-level variables, can be worked with similarly to local variables
val hobby: String = "Playing cricket"

fun main() {

    // 1. VARIABLES -------------

    // var keyword = variables can be reassigned and are mutable
    var colour: String = "Blue";
    colour = "Red"

    // val keyword = variables can't be reassigned and are immutable
    val name = "Johnathon";
    // name = "Adam"; < This won't work

    // Data types are non-null by default, to create a nullable variables we must add a question mark to indicate it can be null
    val fruit: String? = null

    // 2. CONDITIONALS -----------
    var greeting: String? = null

    // when statement - similar to switch case
    // We add the value we are looking for followed by ->
    // We can also add an else statement
    when(greeting) {
       null -> println("Hi")
       else -> print(greeting)
    }

    // Using if expression to assign value to a variable
    // If value of hobby is not null, assign "Playing cricket", else assign "Playing soccer"
    val hobbyToPrint1 = if(hobby != null) hobby else "Playing soccer"
    println(hobbyToPrint1)

    // Using when expression to assign value to a variable
    val hobbyToPrint2 = when(hobby) {
        null -> "Playing Rugby"
        else -> hobby
    }

    println(hobbyToPrint2)


}