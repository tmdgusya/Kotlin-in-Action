package Example01

class CustomAccessor(private val height: Int, private val width: Int) {

    val isSquare: Boolean
        get() {
            return height == width;
        }

}