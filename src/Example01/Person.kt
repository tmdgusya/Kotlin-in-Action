package Example01

fun main(args: Array<String>) {
    val person: Person = Person("roach", false);
}

class Person(
    val name: String,
    var isMarried: Boolean
)