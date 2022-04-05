package Lesson3

const val userName = "Admin"
const val pwd = "admin"

fun main() {
    // success example
    println(userLogin(userName, pwd))

    // failure example
    println(userLogin("Kotlin", "123"))

    // TODO: on the contrary of takeIf, you can use takeUnless to get its opposite value
    // TODO: example: username.takeUnless{ true/false }
    // (1) true: return null
    // (2) false: return value itself
    // takeUnless is always use to check the pass value if initialize

    // something.takeUnless { it.isBlank() } ?: "you have to init the value first"
}

fun userLogin(username: String, password: String): String {
    // "takeIf" function will auto check the state if true and set the value to itself,
    // if the state is false, "takeIf" will return null
    // TODO: "takeIf" always be combine use with "?:"

    // TODO: example: username.takeIf{ true/false }
    // (1) true: return username value itself
    // (2) false: return null
    return "you userName is: ${username.takeIf { checkLogin(username, password) } ?: "null"}"
}


fun checkLogin(username: String, password: String): Boolean {
    return username == "Admin" && password == "admin"
}