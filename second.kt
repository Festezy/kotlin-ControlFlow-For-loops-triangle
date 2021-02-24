fun main(){
    var n = 5
    val n2 = 3

    /** right Triangle */
    for(i in 0 until  n){
        for(k in 0 until i){
            print("* ")
        }
        println("")
    }

    /** left Triangle */
    for (i in 0 .. n2){
        for (j in 0.. n2-i){
            print("  ")
        }
        for (k in 0.. i){
            print(" *")
        }
        println(" ")
    }

    /**full triangle */
    for(i in 0 until  n){
        for(j in 0 until n-i){
            print(" ")
        }
        for(k in 0 until i){
            print("* ")
        }
        println("")
    }
}
