package Example04

fun main(args: Array<String>) {
    val button: Button = Button();

    button.showOff(); // default Method Call
    button.click();
}

class Button : Clickable {
    override fun click() {
        println("Click")
    }
}