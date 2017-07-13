package VMP

import javax.naming.Context

@Suppress("unused", "UNUSED_PARAMETER")
/**
 * Created by ckyoung on 12-Jul-17.
 */

class View {
    companion object {  //Acts as a class with static methods
        @JvmField       //Not truly static unless JvmField or JvmStatic are specified
        val VISIBLE: Int = 0x00000000
        @JvmField
        val INVISIBLE: Int = 0x00000004

        @JvmStatic
        fun inflate(context: Context, resource: Int) {
            //Random code
        }
    }
}

fun main(args: Array<String>) {
    val a: Int = View.INVISIBLE
    val b: Int = View.VISIBLE
    //View.inflate(/*...*/)
}

