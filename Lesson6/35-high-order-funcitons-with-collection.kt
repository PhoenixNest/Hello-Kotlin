package Lesson6

/**
 * [Basic Android-Kotlin-Compose Higher Order Functions](https://developer.android.com/codelabs/basic-android-kotlin-compose-higher-order-functions)
 * */
data class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

private val cookies = listOf(
    Cookie(
        name = "Chocolate chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun forEachTest() {
    cookies.forEach {
        println("Menu item: $it")
    }
}

fun mapTest() {
    val map = cookies.map {
        "${it.name} - $${it.price}"
    }

    println("Full menu:")
    map.forEach {
        println(it)
    }
}

fun filterTest() {
    val filter = cookies.filter {
        it.hasFilling
    }

    println("Soft cookies:")
    filter.map {
        println("${it.name} | ${it.price}")
    }
}

fun groupByTest() {
    val groupBy = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupBy[true] ?: listOf()
    val crunchyMenu = groupBy[false] ?: listOf()

    println("Soft cookies:")
    softBakedMenu.forEach {
        println("${it.name} - $${it.price}")
    }

    println("Crunchy cookies:")
    crunchyMenu.forEach {
        println("${it.name} - $${it.price}")
    }
}

fun foldTest() {
    val totalPrice = cookies.fold(0.0) { result, item ->
        // At the beginning, result will start with 0.0,
        // then plus the item.price to calculate and return the totalPrice
        result + item.price
    }

    println("Total price: $${totalPrice}")
}

fun sortedByTest() {
    val sortedBy = cookies.sortedBy {
        it.name
    }
    println("Alphabetical menu:")
    sortedBy.forEach {
        println(it.name)
    }
}

fun main() {
    forEachTest()
    println("==========")
    mapTest()
    println("==========")
    filterTest()
    println("==========")
    groupByTest()
    println("==========")
    foldTest()
    println("==========")
    sortedByTest()
}