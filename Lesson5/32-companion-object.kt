package Lesson5

class Test {
    // companion will only be created once all the time
    companion object {
        val testName = "this is an companion value"

        fun showName() {
            println("testName: $testName")
        }
    }
}

fun main() {
    // in Kotlin, we can't use static function or value
    // to get the same usage and result like "static", system provided "companion" keyword

    // you can use the inner value or function which inside the companion object directly
    Test.testName
    Test.showName()
}