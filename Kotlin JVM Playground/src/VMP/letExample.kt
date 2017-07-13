package VMP

/**
 * Created by ckyoung on 07-Jul-17.
 */

fun main(args: Array<String>) {
    val t = generateFoo()
    val y = addBar(t)

    //'it' is a temporary variable that is generated with 'let'.
    //In the following case, 'it' holds the string value "foo"
    //and inserted into the function following it (addBar).
    val z = generateFoo().let { addBar(it) }

    println("Value of y is: $y")
    println("Value of z is: $z")
}

fun addBar(str: String): String {
    return "${str}bar"
}

fun generateFoo(): String {
    return "foo"
}