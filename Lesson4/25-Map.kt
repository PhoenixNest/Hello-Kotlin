package Lesson4

fun main() {
    // Create a Map
    // Style 1:
    val map1: Map<String, Int> = mapOf<String, Int>(
        "key1" to 1,
        "key2" to 2
    )
    println(map1)

    // Style 2 (Recommend):
    val map2 = mapOf(
        Pair("key1", 1),
        Pair("key2", 2)
    )
    println(map2)

    // to get the value, you can use map[key]
    println(map1["key1"])
    // same usage like get(key)
    println(map1.get("key1"))

    // (Recommend) you can also use the built-in function like: getOrDefault() or getOrElse()
    val defaultValue = -1
    println(map1.getOrDefault("key1", defaultValue))

    // if we don't have value which key is "key1", return -1
    println(map1.getOrElse("key1") { -1 })

    // (Danger) you can also use the Java style in Kotlin to get the value in map
    println(map1.getValue("key1"))

    // but if we don't have that value, system will be crashed
    // println(map1.getValue("errorKey"))

    println()

    // -------------------------------------------------------------------------------------------

    // in Kotlin, we can also use forEach() to traverse the Map like List
    // Style 1
    map1.forEach {
        // inside the forEach, we use "it" keyword to assign every item in Map
        println("Style1: value key: ${it.key}, value: ${it.value}")
    }

    println()

    // you can also change the "it" keyword by yourself
    // Style 2
    map1.forEach { (key, value) ->
        // inside the forEach, we use "it" keyword to assign every item in Map
        println("Style2: value key: ${key}, value: ${value}")
    }

    println()

    // Style 3
    for (item in map1) {
        println("Style3: value key: ${item.key}, value: ${item.value}")
    }

    println()

    // -------------------------------------------------------------------------------------------

    val mMap = mutableMapOf(
        Pair("mKey1", 1),
        Pair("mKey2", 2)
    )

    mMap += Pair("mKey3", 3)
    mMap -= "mKey3"

    // same result between put() and []: add an new (key, value) into the Map
    mMap["mKey4"] = 4
    mMap.put("mKey5", 5)

    // use getOrPut(){} function to check if the value key existed
    // if the key existed, get that value
    mMap.getOrPut("mKey5") { 6 }

    // if the key is not existed, add it first, and set the value inside {} to it
    mMap.getOrPut("mKey6") { 6 }

    println(mMap)
}