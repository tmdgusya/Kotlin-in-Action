package Example01

fun main(args: Array<String>) {
    val name: String = if (args.isNotEmpty()) args[0] else "Kotlin"

    var person: Person = Person("roach", false);
    person = Person("New Person", true);

    println("Hello $name")
}