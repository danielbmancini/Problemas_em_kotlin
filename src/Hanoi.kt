class Hanoi {
    /*
    * Torres de Hanoi
    * */
    fun torre(n: Int, fromRod:Char, toRod:Char, auxRod:Char){
        if (n == 0)
            return
        torre(n -1,fromRod,auxRod,toRod)
        println("$n de torre $fromRod para $toRod")

        torre(n-1, auxRod,toRod,fromRod)
    }}

    fun main(){
        val N = 3
        val hanoi = Hanoi()
        hanoi.torre(N,'A','B','B')
    }

