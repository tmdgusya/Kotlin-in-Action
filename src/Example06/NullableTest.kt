package Example06

import kotlin.IllegalArgumentException

class NullableTest() {}

fun strLen(s: String?): Int? {
    return s?.length
};

fun main(args: Array<String>) {
    println(strLen(null))
}