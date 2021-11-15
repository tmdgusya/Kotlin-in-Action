package Blog.ObjectTest

class Roach {
    companion object Dodo {
        val name = "Roach~!";
        fun speak() = "Roach! Roach! Roach!"
    }
}

fun main(args: Array<String>) {
    println(Roach.name)
    println(Roach.speak())

    val testCompanion = Roach.Dodo

    println(testCompanion.name)
    println(testCompanion.speak())
}