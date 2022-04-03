fun main() {
    println("Hello World")

    checkScore(100)
    checkScore(-1)
}

private fun checkScore(score: Int) {
    when (score) {
        // in kotlin, TODO() is an nothing function call, it will throw an exception called "NotImplementedError" and killed the program like Java or other languages
        -1 -> TODO("Error")
        in 0..59 -> println("C")
        in 60..70 -> println("B")
        in 71..100 -> println("A")
    }
}

// same usage in interface and class
interface A {
    fun check()
}

class AImpl : A {
    override fun check() {
        // throw "NotImplementedError" exception
        TODO("Not yet implemented")
    }
}