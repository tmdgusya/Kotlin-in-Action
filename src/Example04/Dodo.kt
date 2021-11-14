package Example04

class Dodo private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) : Dodo {
            return Dodo(email.substringBefore('@'));
        }

        fun newFaceBookUser(accountId: Int) : Dodo {
            return Dodo(getFaceBookName(accountId));
        }

        private fun getFaceBookName(accountId: Int) : String {
            return "Roach";
        }
    }
}

fun main(args: Array<String>) {
    val newSubscribingUser: Dodo = Dodo.newSubscribingUser("dodo@naver.com");
    val newFaceBookUser: Dodo = Dodo.newFaceBookUser(1);
}