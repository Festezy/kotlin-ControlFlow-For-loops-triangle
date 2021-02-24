fun main() {

    /** left triangle */
    val n2 = 3

    for (i in 0 .. n2){
        for (j in 0.. n2-i){
            print(" ")
        }
        for (k in 0.. i){
            print("*")
        }
        println(" ")
    }
}
