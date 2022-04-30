package Lesson4

fun main() {
    // there are many mathematical function has built-in in Kotlin
    val num = 2

    // 2 + 2 = 4
    println("plus: ${num.plus(2)}")
    // 2 - 2 = 0
    println("minus: ${num.minus(2)}")
    // 2 * 2 = 4
    println("times: ${num.times(2)}")
    // 2 / 2 = 1
    println("div: ${num.div(2)}")

    // same as mod(2, 10), but be careful with rem()
    println("rem: ${num.rem(10)}")
    println("mod: ${num.mod(10)}")

    // return the negative value
    // example: 1 -> -1
    println("unaryMinus: ${num.unaryMinus()}")

    // ...
}