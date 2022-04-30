package Lesson4

// primary constructor
// by passing the name and sex value, if you want to use its value, you may need to declare the getter value to assess it
class nPerson26(_name: String, _sex: String) {
    var name = _name
    val sex = _sex

    fun show() {
        println("Person26 info -> name: $name, sex: $sex")
    }
}

// (Recommend) primary constructor
// if you want to use the value which is passing by the constructor, you can use this style to gain the same output as above
class Person26(var name: String, val sex: String, val age: Int) {
    fun show() {
        println("(Recommend) Person26 info -> name: $name, sex: $sex, age: $age")
    }
}

// if you have many constructor to override, you can use secondary constructor
class secondPerson26() {
    constructor(name: String) : this() {
        println("one value pass -> name: $name")
    }

    constructor(name: String, age: Int) : this() {
        println("two value pass -> name: $name, age: $age")
    }
}

class initPerson26(_name: String, _sex: String, _age: Int) {
    // in Kotlin, you can use "init" keyword to get the same result in Java
    // Jave example:
    // public class Test{
    //     {
    //         // init code block
    //     }
    // }

    init {
        // inside the init body, you can use _name and _sex directly
        // you can use "init" to check the pass value first
        println("init value -> _name: $_name, _sex: $_sex, _age: $_age")

        // use require() function to check the value
        require(_name.isNotBlank()) { println("Error: Name") }
        require(_sex == "Female" || _sex == "Male") { println("Error: Sex") }
        require(_age > 0) { println("Error: Age") }
    }

    // you can't access _name、_sex and _age if you declare the getter value to assess it before
    // fun show() {
    //     println("initPerson26 info -> name: $_name, sex: $_sex, age:$_age")
    // }
}

fun main() {
    val nPerson = nPerson26(_name = "Android", _sex = "Female")
    nPerson.show()

    val person = Person26("Android", "Female", 18)
    person.show()

    println()

    val secondPersonOne = secondPerson26("Google")
    val secondPersonTwo = secondPerson26("Google", 18)

    println()

    val iPerson1 = initPerson26("Android", "Female", 18)
    val iPerson2 = initPerson26("Android", "_Female_", -1) // this line will throw an error
}
