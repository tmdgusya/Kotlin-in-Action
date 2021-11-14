package Example04

class User constructor (nickname: String) {
    val nickname: String;
    val isSubscribed: Boolean = true;

    init {
        this.nickname = nickname
    }
}

fun main(args: Array<String>) {
    val user: User = User("Roach");

    println(user.nickname)
    println(user.isSubscribed)
}