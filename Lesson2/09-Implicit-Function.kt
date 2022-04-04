package Lesson2

fun main() {
    // we can declare an arrow function to receive the value we have return
    val function1: () -> String

    // then we should declare the function body
    function1 = {
        val text = "Implicit Function"

        // in Kotlin, implicit function will auto assign the last line to return value
        // like "return text;" in Java
        text
    }
    // call the function
    println(function1())

    // ---------------------------------------------------------------------------------
    // also, we can choose the other style to declare another implicit function
    val function2: () -> Int = {
        100
    }
    // call the function
    println(function2())

    // ---------------------------------------------------------------------------------
    // same usage as:
    // fun function(num1: Int, num2: Int): String {
    //     return "num1: $num1, num2: $num2}"
    // }
    val function3: (Int, Int) -> String = { num1, num2 ->
        "num1: $num1, num2: $num2"
    }
    // call the function
    println(function3(1, 2))
    // also, you can use invoke function to pass the value into function
    println(function3.invoke(3, 4))
}