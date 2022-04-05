package Lesson3

fun main() {
    // in Kotlin, we can't create a null value directly
    // if we want to create a value with null, we should use "?"
    val text: String?
    text = "Hello World"

    println(text)

    var knowText: String? = "hi"
    // knowText = null
    knowText = "hello"

    // if the value may be null sometime, you should use "?" to avoid Null-Pointer-Exception before you use it
    knowText?.capitalize()

    // if you are sure of the value is not null, you can use double "!" to skip null-safety check
    // otherwise your program will throw a Null-Pointer-Exception like Java, you should use !! more carefully
    knowText!!.capitalize()
    println(knowText)

    // in Kotlin, we can't use "value ? v1 : v2" style to check the value if null, you can use this style
    // if knowText is null, Kotlin will return the value after ":"
    knowText ?: "knowText is null"
    println(knowText)

    // you can use "let" keyword to make sure the function can be exec and avoid Null-Pointer-Exception
    val result = knowText?.let {
        // we can use it keyword to receive the value
        // normal style:
        if (it.isBlank()) {
            "knowText value: null"
        } else {
            "knowText value: $it"
        }
    } ?: "knowText is null" // combine style, same usage as upper:

    println(result)
}