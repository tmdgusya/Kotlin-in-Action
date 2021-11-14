package Example03

fun main(args: Array<String>) {
    val set = hashSetOf<Int>(1, 7, 53);
    val list = arrayListOf<Int>(1, 7, 53);
    val map = hashMapOf<Int, String>(1 to "one", 7 to "seven");

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val strings = listOf<String>("first", "second", "fourteenth")

    println(strings.last());
}

class CreateCollectionUsingOfMethod {
}