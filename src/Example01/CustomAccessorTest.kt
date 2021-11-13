package Example01

fun main(args: Array<String>) {
    val rectangle = CustomAccessor(
        height = 5,
        width = 5
    )
    println(rectangle.isSquare)
}

class CustomAccessorTest {
}