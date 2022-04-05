package Lesson3

fun main() {
    // compare with apply, Kotlin has another built-keyword call let
    val list = listOf<Int>(1, 2, 3, 4, 5)

    // example 1: use let in list
    // normal style
    val value1 = list.first() // get the first value in list
    val result1 = value1 * 2
    println("normal style: $result1")

    println("---")

    // let style
    val result2 = list.let {
        // inside the function body, we use "it" to get the every value inside
        println(it.first())
        it.first() * 2

        // let will auto set the last line as its return value, this action is not like "apply" keyword
        // true // if the last line is Boolean value, let will return a Boolean type value
        // "apply" keyword always use "this" keyword to return reference of the origin value, and you can not use the last line to change the "apply" return value
    }
    println("let style: $result2")

    println("---")

    // example 2: use let in null check
    println(getMethod1(null))
    println(getMethod1("Hello"))
    println("---")
    println(getMethod2(null))
    println(getMethod2("Hello - let style"))
}

// normal style
fun getMethod1(value: String?): String {
    return if (value == null) "you have pass null value" else "you have pass $value"
}

// simple normal style
fun getMethod1Simple(value: String?) = if (value == null) "you have pass null value" else "you have pass $value"

// let style
fun getMethod2(value: String?): String {
    return value?.let {
        "you have pass $value"
    } ?: "you have pass null value - let style"
}

// simple let style
fun getMethod2Simple(value: String?) = value?.let { "you have pass $value" } ?: "you have pass null value"