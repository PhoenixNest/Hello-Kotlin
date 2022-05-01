package Lesson5

class firstClass {
    val testValue = "first"

    fun showFirstInfo(info: String) {
        println("first info: $info")
    }

    fun callInnerFunction() {
        secondClass().showSecondInfo("this info is come from first, call by FIRST")
    }

    // when the class has declared by "inner"
    // you can use the outside value and function directly
    inner class secondClass {
        fun showOutsideValue() {
            println("call outside value: $testValue")
        }

        fun showOutsideFunction() {
            showFirstInfo("this info is come from second, call by SECOND")
        }

        fun showSecondInfo(info: String) {
            println("second info: $info")
        }
    }

    // by default, you can't call the outside from inner class directly
    class thirdClass {
        fun showThirdInfo(info: String) {
            println("second info: $info")
        }

        // this function is come from secondClass, also we can't call it directly from class without "inner"
        fun showOutsideFunctionFromThird() {
            // showOutsideFunction()
        }
    }
}

fun main() {
    firstClass().showFirstInfo("this is first class")
    firstClass().callInnerFunction()

    firstClass().secondClass().showOutsideValue()
    firstClass().secondClass().showOutsideFunction()
    firstClass().secondClass().showSecondInfo("this is first class")
}