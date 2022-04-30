package Lesson4

fun main() {
    // in Kotlin, normal list can not be change
    val list = listOf("Kotlin", "Android", "OpenSource")
    // normal usage of list
    println("index 0: $list[0]")
    for (item in list) {
        println("list item: $item")
    }

    // in Kotlin, we recommend you to use "getOrElse" function and "getOrNull" function to check the index if overflow
    // when the index is overflow,
    // (1): "getOrElse" will exec the anonymous function and get its return value
    println(list.getOrElse(3) { "overflow" })
    // (2): "getOrNull" will return null
    println(list.getOrNull(3))

    // if you want to change the list, you can use mutableList type
    val mutableList: MutableList<String> = mutableListOf("IOS", "Android", "Windows", "Linux")
    // if you use MutableList type, you can use add(), remove() and many others function
    mutableList.add("macOS")
    mutableList.remove("Android")
    println(mutableList)

    // you can use toMutableList() function to change any normal list to MutableList
    val newList = list.toMutableList()
    println("newList: $newList")

    // after changes, you will get the full usage with MutableList's built-in function
    newList.add("Google")

    // you can also change the MutableList to normal list
    val normalList = mutableList.toList()
    println(normalList)

    // after changes, you can not use the add() or remove() and any other MutableList's function
    // normalList.add() // this line will throw an exception

    // -------------------------------------------------------------------------------------------

    // in Kotlin, we have many useful mutator such as: +=、-=、*=、/=
    val mList: MutableList<String> = mutableListOf("Android", "Java", "Kotlin", "Jetpack")

    mList += "Google"
    mList -= "Java"

    println(mList)

    // in MutableList, we can use "it" keyword to assign any value we have in the list
    // use removeIf function to decide which value contain the pass value then remove it
    // in this example, we will remove "Jetpack" which contains the pass value "a"
    mList.removeIf { it.contains("a") }
    println(mList)

    // -------------------------------------------------------------------------------------------

    // in Kotlin, we have many ways to traverse the list
    val tList = listOf<Int>(1, 3, 5, 7, 9)

    println(tList)

    // (1) Normal Style
    for (i in tList) {
        println("(1) Item: $i")
    }

    println()

    // (2) ForEach Style
    tList.forEach {
        // inside the forEach function body, we use "it" keyword to assign the value
        // you can customize the keyword by yourself
        println("(2) Item: $it")
    }

    // list.forEach { item ->
    //     println("(2) Item: $item")
    // }

    println()

    // (3) forEachIndexed Style
    // you should pass two value to gain the return values
    tList.forEachIndexed { index, item ->
        println("(3) List index: $index, Value: $item")
    }

    // -------------------------------------------------------------------------------------------

    val dList: List<String> = listOf("Android", "Jetpack", "Kotlin")

    println(dList)

    // in Kotlin, we can use deconstruction style to get the value we need
    // use v1, v2, v3 to assign the value in the list
    val (v1, v2, v3) = dList

    println("value1: $v1, value2: $v2, value3: $v3")

    // if we use "_" keyword to assign the value, that value will be skipped
    val (_, _, i3) = dList
    println("item3: $i3")
}