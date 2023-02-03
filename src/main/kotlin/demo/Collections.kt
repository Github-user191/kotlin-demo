package demo

// By default Collection types are immutable

fun main(){
    // ARRAY
    val myArray = arrayOf("Kotlin", "Java", "C#")

    // Loop over array
    for(item in myArray) {
        println(item)
    }

    // Loop over array using lambda syntax without index
    myArray.forEach { item ->
        println(item)
    }

    // Loop over array using lambda syntax with index
    myArray.forEachIndexed { index, item ->
        println("$item is at index $index")
    }

    // LIST (IMMUTABLE)
    val myList = listOf("Kotlin", "Java", "C#")

    myList.forEach { item ->
        println(item)
    }

    // LIST (MUTABLE) - can add / remove values
    val myListImmutable = mutableListOf("Kotlin", "Java", "C#")
    myListImmutable.add("Python")
    myListImmutable.forEach { item ->
        println(item)
    }

    // MAP
    val myMap = mutableMapOf(1 to "a", 2 to "b", 3 to "c")

    myMap.forEach {(key, value) ->
        println("$key -> $value")
    }

    myMap.put(4, "d")

    myMap.forEach { (key, value) ->
        println("$key -> $value")
    }


    // Using function by passing collection
    val interestingThings = listOf("Apples", "Pears", "Grapes")
    sayHello("Hello", interestingThings)


}



fun sayHello(greeting: String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}