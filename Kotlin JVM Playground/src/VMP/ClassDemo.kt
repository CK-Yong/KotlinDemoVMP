package VMP

class SogyoEmployee constructor(val name: String, age: Int) {
    init {
        println("${this.name} heeft zijn computer aangezet.")
    }
    var coffee: Int = 0
        private set(value) {
            if (value <= 0) {
                throw IllegalArgumentException("Amount of coffee should be more than zero.")
            }
            field = value
        }

    var age: Int = age
        set(value) {
            checkIfAgeIsValid(value)
            field = value
            println("Ik ben ouder geworden! Ik ben nu $value jaren jong ;)")
        }

    private fun checkIfAgeIsValid(value: Int): String {
        if (this.age<value) {
            return "older"
        }
        throw IllegalArgumentException("Cannot age negatively!")
    }

    fun getCoffee(coffee: Int) {
        this.coffee += coffee
        println("${this.name} staat op en haalt $coffee ${if (coffee > 1) "kopjes" else "kop"} koffie.")
    }
}

fun main(args: Array<String>) {
    val cheeKent = SogyoEmployee("Chee Kent", 25)
    cheeKent.getCoffee(1)
//    cheeKent.coffee = 5
    println("Chee Kent heeft nu ${cheeKent.coffee} kopjes koffie.")
    cheeKent.age = 26
}