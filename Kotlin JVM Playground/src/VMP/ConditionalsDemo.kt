package VMP

import java.lang.Integer.parseInt

/**
 * Created by ckyoung on 07-Jul-17.
 */

fun main(args: Array<String>) {

    //when demo

    val cat = "Spike"

    when (cat) {
        "Felix" -> println("Felix")
        "Snuggles" -> println("Snuggles")
        "Spike" -> {
            println("Spike is not a cat.")
            println("Please provide a cat's name.")
        }
        is String -> println("Cat encoded in string.")
        else -> println("Name not recognized.")
    }

    val numberOfDogs = 287

    when (numberOfDogs) {
        1 -> println("exact right amount of dogs.")
        in 1..10 -> println("1 to 10 dogs.")
        !in 250..300 -> println("Either not enough or too many dogs.")
        5, 10, 15 -> println("5, 10 or 15 dogs found.")
        is Int -> println("Number of dogs is an Int.")
        else -> println("No match found, there are $numberOfDogs dogs.")
    }

    val numberOfCats = 25
    val catTest = "25"

    when (numberOfCats) {
        parseInt(catTest) -> println("Match found.")
        else -> println("No match found.")
    }

    val randomNum: Int = (Math.random() * 10 + 1).toInt()

    when {
        randomNum.isOdd() -> println("Random number is odd: $randomNum")
        randomNum.isEven() -> println("Random number is even: $randomNum")
    }

    //for loops

    for (i in 1..100) {
        print("$i ")
    }

    println()

    for (i in 100 downTo 1 step 5) {
        print("$i ")
    }

    println()

    val myArray = arrayOf("Hello", "World", "Goodbye")

    for (i in myArray.indices) {
        print("${myArray[i]} ")
    }

    println()

    for (str in myArray) {
        print("$str ")
    }

    println()

    val foo = 0
    val bar = 10
    for (number in foo..bar) {
        print("$number ")
    }

    println()
    println("dog".repeat(10))
}

fun Int.isOdd(): Boolean {
    if (this % 2 == 0) {
        return false
    }
    return true
}

fun Int.isEven(): Boolean {
    if (this % 2 == 0) {
        return true
    }
    return false
}