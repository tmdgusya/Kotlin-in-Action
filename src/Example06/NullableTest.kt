package Example06

import kotlin.IllegalArgumentException

class NullableTest() {}

fun strLen(s: String?): Int {
    var string: String = s ?: "🙏"
    return string.length
};

fun main(args: Array<String>) {
    println(strLen(null))
}