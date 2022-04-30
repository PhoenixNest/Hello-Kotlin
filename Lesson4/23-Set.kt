package Lesson4

fun main() {
    // Set type will auto remove the duplicate value in the set
    val set: Set<String> = setOf("Android", "Jetpack", "Kotlin", "Kotlin")
    println(set)

    println()

    // in Kotlin, we can use list[0] to get the first value in the list
    // but in Set, we should use elementAt(index) function to get the value
    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))

    println()

    // we recommend combining use "?:" in Set
    println(set.elementAtOrNull(0) ?: "Index out of range")
    println(set.elementAtOrNull(1) ?: "Index out of range")
    println(set.elementAtOrNull(2) ?: "Index out of range")

    // this line will throw an error then we use "Index out of range" to avoid the system error
    println(set.elementAtOrNull(3) ?: "Index out of range")

    println()

    // you can also use MutableSet to change the value in the Set
    val mSet: MutableSet<String> = mutableSetOf("Lesson1.A", "B", "C", "D")
    // Set has some same usage function like List
    // such as:
    mSet += "E"
    mSet.add("F")

    mSet -= "E"
    mSet.remove("F")
    println(mSet)

    println()

    // -------------------------------------------------------------------------------------------

    // because the Set can't save duplicate value, we can use it to remove the duplicate value which in other DS-type like List
    val list: MutableList<String> = mutableListOf("Lesson1.A", "Lesson1.A", "B", "B", "C")

    // (1) Normal Style
    println(list.toSet())

    // (2) to get the origin List style, you can use toSet -> toList
    println(list.toSet().toList())

    // (3) use the built-in function, inside the distinct() function, system just run the same code as (2)
    println(list.distinct())

}