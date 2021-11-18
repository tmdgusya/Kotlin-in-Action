package Example06

import kotlin.IllegalArgumentException

class NullableTest() {}

fun strLen(s: String?): Int {
    if (s == null) {
        throw IllegalArgumentException("잘못된 입력값 입니다.");
    }
    return s.length
};

fun main(args: Array<String>) {
    println(strLen(null))
}