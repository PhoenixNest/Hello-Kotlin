package Lesson3

fun main() {
    val text = "Hello-World"
    val endIndex = text.indexOf("W")

    // TODO: (1) Cut the String from (startIndex, endIndex)
    // in this example, endIndex is start from 0 to 5
    // then will return "Hello-"
    println(text.substring(0, endIndex))
    // you can also use the Kotlin style to implement substring()
    // use "until" keyword to tell the IDE from 0 to endIndex
    println("Kotlin style: ${text.substring(0 until endIndex)}")

    // TODO: (2) Split String
    val jsonText = "Kotlin, Jetbrains, Google, Android"
    // pass the divider, then Kotlin will split the text.txt base on it
    val list = jsonText.split(", ")
    println("Split jsonText: $list")
    // we can also deconstruct the list to get its value
    val (s1, s2, s3, s4) = list
    println("after deconstruct: s1:$s1, s2:$s2, s3:$s3, s4:$s4")

    // TODO: (3) Replace String
    // this function also can be used to Encode and Decode the password or other information you want
    val sourceText = "Hi, Kotlin"
    // you can use regular expression to replace any character you want
    val newText = sourceText.replace(Regex("[il]")) {
        // if you not do anything, "it" keyword will always be the sourceText
        // in this example, "Hi, Kotlin" will be replace with "HI, KotLIn"
        when (it.value) {
            "i" -> "I"
            "l" -> "L"
            else -> it.value
        }
    }
    println(newText)
}