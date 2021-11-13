package Example01

import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))));
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int {
    if (e is Num) {
        val n: Num = e as Num;
        return n.value;
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left);
    }
    throw IllegalArgumentException("Unknown Expression");
}