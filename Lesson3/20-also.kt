package Lesson3

import java.io.File

fun main() {
    // TODO: "also" function is more like "apply" function, you can compare with Lesson3/16-apply.kt
    val text = "Hello World"
    println(text.also {
        // in "also" function, you can use "it" keyword to access the instance of origin value,
        // but you can not change the origin value inside the "also" function body,
        // "also" will only use "it" keyword to return the reference of origin value all the time
        it.length
    })

    val filePath = "Lesson3/text.txt"
    val file = File(filePath)
    // traditional style to custom the instance:
    file.setReadable(true)
    file.setWritable(true)

    // in Kotlin, "also" function also support chain calls
    // like this:
    file.also {
        // in this example, "it" keyword has set to the instance of file
        it.setReadable(true)
        // it.setWritable(true)
        // println(file.readLines())
    }.also {
        it.setWritable(true)
    }.also {
        println(file.readLines())
    }
}