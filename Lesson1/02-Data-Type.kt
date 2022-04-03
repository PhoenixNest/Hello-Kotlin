// we can only use the const outside the fun
// the difference between "const val" (also called precompiled value) and simple "val"
// (1) "const val" will pe recompiled before we call the function, and its value will be set only once all the time
// (2) "val" means: read-only value, it will be compiled after the function call, and we can't use "const" inner fun body
const val Base = "Base"
const val PI = 3.1415f

fun main() {
    // in kotlin, we use String, Char, Boolean, Int, Double, List, Set, Map... to define the date type
    // like this:
    var i: Int = 1
    var j: Float = 9.55f
    var k: Double = 6.17
    var check: Boolean = true

    // we can change var's value
    i = 2
    println(i.toString())

    // if we never change the value, that we can use val to assign the data type
    // val can only be read and can't to be overwritten
    val text: String = "Text"
    println(text)

    // kotlin can auto-detect the data type and assign its type
    val info = "Info"
    println(info)

    // in kotlin, if we use "", it will be assigned to String type
    // if we use '', it will be assigned to Char type
    val char = 'c'
    println(char)
}