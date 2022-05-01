package Lesson5

data class Person(val name: String, val sex: String) {
    fun showInfo() {
        println("name: $name, sex: $sex")
    }
}

fun main() {
    val person1 = Person("Peter", "Female")
    val person2 = Person("Chen", "Female")
    val person3 = Person("Chen", "Female")

    person1.showInfo()
    person2.showInfo()

    // data class will auto overwrite the toString() function and set it to default
    println(person1)
    println(person2)

    // data class will auto overwrite the equals() function
    // in Kotlin, we use "==" to check the value if equal
    println("normal style: ${person1.equals(person2)}")
    println("== value check style: ${person1 == person2}")
    println("== value check style: ${person2 == person3}")

    // if we use "===", we will check the reference if equal
    println("=== reference check style: ${person1 === person2}")

    // data class will also overwrite the built-in function like hashCode() and copy() function and more...
}