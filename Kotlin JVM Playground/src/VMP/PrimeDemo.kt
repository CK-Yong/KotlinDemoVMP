package VMP

/**
 * Created by ckyoung on 27-Jun-17.
 */

fun main(args: Array<String>) {
    var i: Int = 0              //returns 10000

    while (i < 100) {
        i = i.findNextPrime()
        println(i)
    }

    println("Next prime after 100: ${100.findNextPrime()}")


    println("The number 1007 is a prime: ${1007.isPrime()}")
}

fun Int.isPrime(): Boolean {
    val upperSearchLimit = (Math.sqrt(this.toDouble()) + 1).toInt()
    if (this in 0..2) {
        return true
    }
    for (i in 2..upperSearchLimit) {
        if (this % i == 0) {
            return false
        }
    }
    return true
}

//Extension functions
fun Int.findNextPrime(): Int {
    var counter = this
    do {
        counter++
    } while (!counter.isPrime())
    return counter
}
