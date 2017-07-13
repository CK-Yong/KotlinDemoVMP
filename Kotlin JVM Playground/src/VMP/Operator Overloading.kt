package VMP

/**
 * Created by ckyoung on 12-Jul-17.
 */

fun main(args: Array<String>) {
    val dayCounter = DayCounter()
    println(dayCounter + 50)    //prints 55
}

class DayCounter {
    var counter: Int = 5
    operator fun plus(increment: Int): Int {
        return (this.counter + increment)
    }
}



