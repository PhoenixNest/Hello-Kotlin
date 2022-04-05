package Lesson3

fun main() {
    // use some function we have done in Lesson3/18-run.kt
    val text = "Hello World"

    // in Kotlin, "with" keyword is more like the "run" keyword and only different in its usage
    // "run" style:
    text.run(::getOriginText)
        .run(::checkTextLength)
        .run(::showCheckTextLengthResult)
        .run(::getFinalText)
        .run(::println)

    // with style
    // "with" is not support chain function
    with(
        with(
            with(
                with(
                    with(text, ::getOriginText),
                    ::checkTextLength
                ),
                ::showCheckTextLengthResult
            ),
            ::getFinalText
        ), ::println
    )

    // also, you can use the anonymous function
    with(
        with(
            with(
                with(text) {
                    println(text) // getOriginText
                    this
                }
            ) {
                this.length > 6 // checkTextLength
            }
        ) {
            if (this) "Result: text length > 6, Pass" else "text length < 6, Reject" // showCheckTextLengthResult
        },
    ) {
        println(this) // getFinalText and println
    }

}
