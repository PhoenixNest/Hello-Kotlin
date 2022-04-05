package Lesson3

fun main() {
    // in kotlin, double "==" and triple "===" is not the same
    val text1 = "text.txt"
    val text2 = "text.txt"
    val text3 = "Hello World"
    val text4 = "text.txt"

    // double "==" will only check the velue
    println(text1 == text2)
    // triple "===" will check the reference between the pass value, and check if they are point to the same cache in the RAM pool
    println(text1 === text2)

    println(text1 == text3)
    println(text1 === text3)

    // although you have made the same result between two pass value, but its reference is not the same in the RAM pool
    // any changes to text.txt will create a reference to its origin value, and check the new value in the RAM pool
    println(text1 == text4.capitalize())
    // same usage in triple "==="
    println(text1 === text4.capitalize())
}