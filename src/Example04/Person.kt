package Example04

class Person(val name: String) {

    var address: String = "unspecified"
        set(value: String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
        get(): String {
            return "$field Good!"
        }

}

fun main(args: Array<String>) {
    val person: Person = Person("DODO");

    println(person.address)

    person.address = "NewYork"

    println(person.address)
}