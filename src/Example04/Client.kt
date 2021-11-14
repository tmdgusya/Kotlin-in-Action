package Example04

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client1 = Client("Roach", 13);
    val dupClient = Client("Roach", 13);

    println(client1 == dupClient)

    println(client1.toString())
    println(dupClient.toString())
}
