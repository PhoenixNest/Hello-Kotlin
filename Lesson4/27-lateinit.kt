package Lesson4

class LateInit27 {
    // if you don't want to initialize the value all the time, you can use "lateinit" keyword
    // Note: "lateinit" can only be used in var type
    lateinit var data: String;

    fun fetchData() {
        data = "Success"
    }

    fun showData() {
        if (::data.isInitialized) {
            println("Server Data: $data")
        } else {
            println("Error")
        }
    }
}

fun main() {
    val lateInit27 = LateInit27()
    lateInit27.fetchData()
    lateInit27.showData()
}