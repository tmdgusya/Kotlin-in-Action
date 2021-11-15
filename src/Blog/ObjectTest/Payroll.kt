package Blog.ObjectTest

object Payroll {
    val allEmployees = arrayListOf<String>("Roach", "Dodo");
    fun calculateSalary() {
        for (person in allEmployees) {
            TODO("Something...")
        }
    }
}

fun main(args: Array<String>) {
    println(Payroll.allEmployees)
    Payroll.calculateSalary();
}