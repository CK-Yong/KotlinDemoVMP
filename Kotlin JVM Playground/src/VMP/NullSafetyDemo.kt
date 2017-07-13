package VMP

/**
 * Created by ckyoung on 11-Jul-17.
 */

class NullSafetyDemo{
    var a: String = "abc"
    var b: String? = "def"
}

fun main(args: Array<String>) {
    val nullSafety = NullSafetyDemo()
   // nullSafety.a = null
    nullSafety.b = null

    //Safe call
    val lengthOfA = nullSafety.a.length
    val lengthOfB = nullSafety.b?.length
    val lengthOfBThatActuallyWorks = nullSafety.b?.length
    //Elvis Operators can assign a default value if null
    val lengthOfBWithDefaultValue = nullSafety.b?.length?: 1337 //returns 1337
    val lengthOfBWithExceptionThrowing = nullSafety.b?.length?: throw IllegalArgumentException("b cannot be null!")
}



