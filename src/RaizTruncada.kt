import kotlin.math.abs
import kotlin.math.floor

class LeetCode69 {
     /*Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
     The returned integer should be non-negative as well.*/

    fun mySqrt(x: Int): Int {
        val guess:Double = (x.toDouble() / 2.0)

        return newtonRaphsonIteration(guess,x,0)
    }

    fun newtonRaphsonIteration(guess: Double, goal: Int, iterationCounter: Int): Int {
        val y = guess * guess
        val itc = iterationCounter + 1

        if (goal < 1)
            return 0
         else if (goal < 4)
            return 1

        if (abs(y - goal) < 1){
           // println(itc)
            return floor(guess).toInt()
        } else {
            return newtonRaphsonIteration((guess + goal / guess)/ 2, goal, itc)
        }
    }

}

    fun main(){
        val sqrt = LeetCode69()
        for (i in 0 .. 20){
            println("truncated √$i is ${sqrt.mySqrt(i)}")

        }
    }