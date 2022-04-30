package Lesson4

class ByLazy28 {
    // you can also use "by lazy" function to initialize the value.
    // value will auto be assigned when you use

    // unlike the "lateinit" keyword, in "by lazy", you don't need to assign the value by yourself
    val dataBaseData by lazy {
        readData()
    }

    private fun readData(): String {
        for (index in 1..10) {
            println("loading Data, Please standby...")
        }

        return "Finish"
    }
}

fun main() {
    val bylazy28 = ByLazy28()

    println(bylazy28.dataBaseData)
}