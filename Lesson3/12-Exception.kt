package Lesson3

fun main() {
    try {
        val info: String? = null

        // there is many exception check function in Kotlin, you can use the built-in function to check value
        checkNotNull(info)
        requireNotNull(info)

        // check Exception with you own Exception
        checkException(info)

        println(info!!.length)

    } catch (exception: Exception) {
        println("Exception: $exception")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

// you can create your own Exception
class CustomException : IllegalArgumentException("ERROR!!!")