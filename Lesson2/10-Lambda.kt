package Lesson2

const val loginUserName = "Kotlin"
const val loginPassword = "1234567890"

fun main() {
    println("Login Test")
    loginApi(loginUserName, loginPassword) { msg: String, code: Int ->
        // use Lambda function to receive the responseResult
        println("Login Result: msg:$msg, code:$code")
    }

    // Cite usage
    // in Kotlin, we use double "::" to cite the function
    loginInlineApi(loginUserName, loginPassword, ::handleLoginResult)

    // also, we can use the val or var to storage the cite, like the pointer usage in C/C++
    val citeFunction = ::handleLoginResult
    loginInlineApi(loginUserName, loginPassword, citeFunction)
}

// in kotlin, we can simply use the lambda function to gain the same result as interface in Java
// if we have a login function
// Kotlin lambda Style
// normal style will create multiply Instance for Lambda usage
fun loginApi(userName: String, password: String, responseResult: (String, Int) -> Unit) {
    // front-end check
    // although kotlin function can't pass null value, but we should still check the front-end if user do not pass any value]
    if (userName == null || password == null) {
        TODO("you must input username and password")
    }

    if (userName.length > 3 && password.length > 6) {
        if (loginService(userName, password)) {
            responseResult("success", 200)
        } else {
            responseResult("failure", -1)
        }
    }
}

// inline style in Kotlin
// if you have use Lambda, we recommend you to use inline style to write the lambda function,
// inline action will decrease the Cpu and RAM usage (same as inline usage in C++, copy all the code into function call position)
inline fun loginInlineApi(userName: String, password: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || password == null) {
        TODO("you must input username and password")
    }

    if (userName.length > 3 && password.length > 6) {
        if (loginService(userName, password)) {
            responseResult("success", 200)
        } else {
            responseResult("failure", -1)
        }
    }
}

// also, we can create a cite of function to use the lambda function
fun handleLoginResult(msg: String, code: Int) {
    println("cite -> Login Result: msg:$msg, code:$code")
}

val loginService: (String, String) -> Boolean = { userName, password ->
    userName == loginUserName && password == loginPassword
}