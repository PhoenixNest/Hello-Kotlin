package Lesson1

fun main() {
    val school = "school"
    println("Go to $school")
    // or
    // println("Go to ${school}")

    // combine with "if" style
    val sex = "female"
    println("you sex is: ${if (sex.equals("male")) "male, " else "female"} ")
}