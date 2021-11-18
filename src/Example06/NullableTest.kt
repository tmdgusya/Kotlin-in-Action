package Example06

import kotlin.IllegalArgumentException

class NullableTest() {}

fun strLen(s: String?): Int {
    var string: String = s ?: "🙏"
    return string.length
};

fun sendToEmail(email: String) {
    println("SEND TO $email")
}

fun main(args: Array<String>) {
    println(strLen(null))

    var email: String? = ""
    sendToEmail(email);
}