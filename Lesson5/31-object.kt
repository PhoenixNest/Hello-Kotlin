package Lesson5

// in Kotlin, when you declare an object class, this class will auto create a single instance
// this is more like the Single-Instance mode in Object-Oriented code style
object Utils {
    fun getData(url: String) {
        println("Utils-> getData url is: $url")
    }
}

open class NetUtils {
    open fun fetchData(url: String) {
        println("NetUtils-> fetchData url is: $url")
    }

    open fun uploadData(url: String) {
        println("NetUtils-> uploadData url is: $url")
    }
}

fun main() {
    // because of the Utils class is an object class, you can use it anywhere and call its function too
    Utils.getData("Utils/fetch")

    // you can also use "object" keyword to achieve the anonymous subclass
    val newUtils: NetUtils = object : NetUtils() {

        // overwrite function
        override fun fetchData(url: String) {
            println("newUtils-> fetchData url is: $url")
        }

        override fun uploadData(url: String) {
            println("newUtils-> uploadData url is: $url")
        }
    }

    newUtils.fetchData("newUtils/fetch")
    newUtils.uploadData("newUtils/upload")
}