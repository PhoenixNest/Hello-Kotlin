fun main() {
    println("Hello World")

    function1("text")
    function2withDefaultValue(num = 10)
    function3withAllDefaultValue()
    function4named(text = "text")

    function5withoutReturn()
}

fun function1(text: String) {
    println("function1: $text")
}

fun function2withDefaultValue(text: String = "default text", num: Int) {
    println("function2: $text, num: $num")

}

fun function3withAllDefaultValue(text: String = "default text", num: Int = 100) {
    println("function3: $text, num: $num")
}

// we can also test the private style fun
fun function4named(text: String, num: Int = 128) {
    println("function4: $text, num: $num")
}

// kotlin use the Unit type to make the same result with void in Java
// same as: public void function(){}
fun function5withoutReturn(): Unit {
    println("function5: This is the non return function with Unit")
}