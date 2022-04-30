package Lesson4

fun main() {
    // in Kotlin, we have many Array type
    // such as:
    // (1) IntArray -> intArrayOf()
    // (2) DoubleArray -> doubleArrayOf()
    // (3) LongArray -> longArrayOf()
    // (4) ShortArray -> shortArrayOf()
    // (5) ByteArray -> byteArrayOf()
    // (6) FloatArray -> floatArrayOf()
    // (7) BooleanArray -> booleanArrayOf()
    // (9) Array -> arrayOf()
    val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
    intArray.forEach {
        println(it)
    }

    // we can use elementAtOrElse(index) function to check the value
    // if the value is illegal, return the -1 or any other value you want
    println(intArray.elementAtOrElse(0) { -1 })
    println(intArray.elementAtOrElse(50) { -1 })

    // we can also combine use elementAtOrNull() function with "?:" keyword to avoid some out of range problem
    println(intArray.elementAtOrNull(0) ?: "out of range")
    println(intArray.elementAtOrNull(100) ?: "out of range")
}