package Lesson3

import kotlin.math.roundToInt

fun main() {
    val normalIntString = "123"

    // you can use toInt() function to change value into Int, also you can use toDouble() and more function
    println(normalIntString.toInt())
    // recommend to use toIntOrNull() function to check the pass value, and use "?:" to check the pass value
    println(normalIntString.toIntOrNull() ?: "origin value is not Int, return null")

    val normalDoubleString = "123.4"
    println(normalDoubleString.toDouble())
    println(normalDoubleString.toDoubleOrNull() ?: "origin value is not Double, return null")

    val num1 = 123.4
    val num2 = 123.5f
    // you can use the round function to change the double or float value
    println(num1.roundToInt())
    println(num2.roundToInt())

    val num3 = 123.456789
    // if you only want to keep three decimal places, you can use this:
    println("%.3f".format(num3))
}