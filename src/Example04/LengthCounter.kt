package Example04

class LengthCounter {

    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length;
    }

}

fun main(args: Array<String>) {
    val length: LengthCounter = LengthCounter();

    println(length.counter)

    length.addWord("!@#!@#")

    println(length.counter)
}