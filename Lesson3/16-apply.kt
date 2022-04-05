package Lesson3

import java.io.File

fun main() {
    val text = "Hello World"
    println(text.apply {
        // in "apply" function, you can use "this" keyword to access the instance of origin value,
        // but you can not change the origin value inside the "apply" function body,
        // "apply" will only use "this" keyword to return the reference of origin value all the time
        this.length
    })


    val filePath = "Lesson3/text.txt"
    val file = File(filePath)
    // traditional style to custom the instance:
    file.setReadable(true)
    file.setWritable(true)

    // in Kotlin, "apply" function also support chain calls
    // like this:
    file.apply {
        // in this example, "this" keyword has set to the instance of file
        // also you can skip use "this" keyword inside the function
        setReadable(true)
    }.apply {
        setWritable(true)
    }.apply {
        println(file.readLines())
    }
}