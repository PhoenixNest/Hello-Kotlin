package Lesson3

fun main() {
    val text1 = "Hello World"
    val result1 = text1.run {
        // run function use "this" keyword to get the origin value, this is more like "apply"
        // but in "apply", Kotlin will return the reference of the origin value, so you can not change its origin value
        this

        // if you want to change the origin value, "run" will auto set the last line to its return value, this is more like "let"
        // 123
    }
    println("Result1: $result1")

    val text2 = "Hi"
    // you can also use the named function and pass into "run"
    // "run" will auto set the input parameter use "this" keyword and get the passed function return value
    val result2 = text2.run(::checkTextLength)
    println("Result2: $result2")

    // compare with let
    val text3 = "Hi"
    val result3 = text3
        .let(::getOriginText)
        .let(::checkTextLength)
        .let(::showCheckTextLengthResult)
        .let(::getFinalText)
        .let(::println)

    // "run" is another function which combine some useful usage as "apply" and "let", it also supports chain method
    val text4 = "Hi, Kotlin"
    var result4 = text4
        .run {
            println(this)
            this
        }
        .run {
            this.length > 6
        }.run {
            if (this) "Result: text length > 6, Pass" else "text length < 6, Reject"
        }.run {
            println(this)
        }
    // use named function to get the same result
    result4 = text4
        .run(::getOriginText)
        .run(::checkTextLength)
        .run(::showCheckTextLengthResult)
        .run(::getFinalText)
        .run(::println) // you can also use "run" to run some built-in function like println() to print the result
}

fun getOriginText(text: String): String {
    println(text)

    return text
}

fun checkTextLength(text: String): Boolean = text.length > 6

fun showCheckTextLengthResult(result: Boolean): String {
    return if (result) "Result: text length > 6, Pass" else "text length < 6, Reject"
}

fun getFinalText(text: String) = text