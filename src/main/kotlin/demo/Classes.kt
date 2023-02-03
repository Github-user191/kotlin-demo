package demo

// Primary Constructor
public class Classes(_firstName: String, _lastName: String) {

    // Variables with VAL have only getters automatically
    val firstName: String = _firstName
    val lastName: String = _lastName

    // Variables with VAR have both getters and setters automatically
    var nickName: String? = null
        set(value) {  // We can provide our own implementation of Setter methods
            field = value
            println("the new nickname is $value")
        }
        get() {  // We can provide our own implementation of Getter methods
            println("The return value is $field")
            return field
        }

    // INIT BLOCKS - executes after PRIMARY constructor but before SECONDARY constructor
    init {
        println("init 1")
    }

    init {
        println("init 2")
    }

    // SECONDARY CONSTRUCTOR
    constructor():this("Peter", "Parker") {
        println("Secondary constructor")
    }


    fun printInfo() {
        // val nickNameToPrint = if(nickName!=null) nickName else "No Nickname"
        // Elvis operator (?:) , if whats on the left side is not null, return it else return whats on the right side of Elvis operator
        val nickNameToPrint = nickName ?: "No Nickname"
        println("$firstName $nickNameToPrint $lastName")
    }

}

fun main() {
    val person = Classes()
    println(person.firstName)
    println(person.nickName)


    person.printInfo()
}