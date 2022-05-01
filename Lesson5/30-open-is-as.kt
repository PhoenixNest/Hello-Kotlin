package Lesson5

// in Kotlin, all class will be set as final as default, this is unlike the Java style
// in Java, all class will be set as public as default

// if you want to achieve the same result as "extend" in Java
// you can use "open" keyword to make the  class which can be extended
open class MyObject(val name: String) {
    private fun getName() = println("name is: $name")

    // same as the "open class", if you want to overwrite the function, you can use "open fun"
    open fun eat() = println("eat")
}

class ExtendMyObject(val subName: String) : MyObject(subName) {
    private fun showName() = println("subName is: $subName")

    override fun eat() {
        println("subEat")
    }
}

fun main() {
    val myObject: MyObject = ExtendMyObject("subObject")

    // also, you can use "is" keyword to check the type of instance
    // like the "instanceof" keyword in Java
    if (myObject is ExtendMyObject) {
        // use "as" keyword to force change the type of the instance

        // because of the overwrite function, eat() function which inner the ExtendMyObject will be exec
        (myObject as ExtendMyObject).eat()
    }

    myObject.eat()
}