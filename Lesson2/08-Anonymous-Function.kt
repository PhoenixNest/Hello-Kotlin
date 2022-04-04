package Lesson2

fun main() {
    val text = "Hello World"

    // use count function to count the character num of text
    println(text.count())

    // you can also use the anonymous function to count the specified value
    // if you use anonymous style function, you can remove the () if you don't need
    println(text.count {
        // in this example, "it" keyword will be auto assign to every single Char character in String
        it == 'l'
    })

    // TODO: "it" usage in Anonymous function
    // if your function has only one value pass,
    // you don't have to assign a name to it,
    // Kotlin will auto generate a name to one value function and assign it with "it" keyword
    val function1: (String) -> String = { "function1: pass value: $it" }
    println(function1("Hello World"))

    val function2: (Double) -> String = {
        "function2: this is the double value: $it"
    }
    println(function2(123.4))

    // if you want Kotlin auto-detect the return value type, you can use this style
    val function3 = { number: Int ->
        // Kotlin will auto-detect the last line then mark it to return value
        println("test: $number")

        number
    }
    println("function3 with auto-detect return value: " + function3(10))

    // if you have multiply return type, Kotlin will return Any type to auto optimize any possible output value
    val function4 = { number: Int ->
        when (number) {
            1 -> "you have choose 1"
            2 -> "you have choose 2"
            3 -> "you have choose 3"
            4 -> "you have choose 4"
            5 -> "you have choose 5"
            else -> -1
        }
    }
    println(function4(3))
    // println(function4(6))
}