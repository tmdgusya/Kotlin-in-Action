package Blog.ObjectTest

open class Parent {
    companion object {
        val props = "parent";
    }
    open fun methodParent1() = props
}

class Child: Parent() {
    companion object {
        val props = "child";
    }
    override fun methodParent1() = props;
    fun childMethod1() = props;
    fun childMethod2() = props;
}

fun main(args: Array<String>) {
    val child: Parent = Child();

    println(child.methodParent1()); // child
}