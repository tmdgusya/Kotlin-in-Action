package Example01

fun main(args: Array<String>) {
    val expression: IfIsExpression = IfIsExpression();

    println(expression.max(3, 5));
}

class IfIsExpression {

    fun max(a: Int, b: Int): Int {
        return if ( a > b ) a else b;
    }

}