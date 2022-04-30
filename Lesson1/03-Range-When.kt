package Lesson1

fun main() {
    val score = 96
    checkScore_Range_Style(score)

    val todayIs = 5
    println(checkDay_When_Style(todayIs))
}

// (num) in (range)
fun checkScore_Range_Style(score: Int) {
    if (score in 0..60) {
        println("you score -> C")
    } else if (score in 61..80) {
        println("you score -> B")
    } else if (score in 81..90) {
        println("you score -> Lesson1.A")
    } else {
        println("you score -> S")
    }
}

// like switch...case
fun checkDay_When_Style(day: Int): String {
    return when (day) {
        1 -> "Today is Monday"
        2 -> "Today is Tuesday"
        3 -> "Today is Wednesday"
        4 -> "Today is Thursday"
        5 -> "Today is Friday"
        6 -> "Today is Saturday"
        else -> "Today is Sunday"

        // else -> {
        //     println("return function style")
        // }
    }
}