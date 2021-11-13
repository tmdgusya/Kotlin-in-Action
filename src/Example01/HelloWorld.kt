package Example01

fun main(args: Array<String>) {
    val name: String = if (args.isNotEmpty()) args[0] else "Kotlin"
    println(name)
}