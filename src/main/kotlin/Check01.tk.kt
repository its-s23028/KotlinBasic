package org.example


fun main(args: Array<String>) {
    val score = readln().toInt()

    val rank = when (score){
        in 0..60 ->"D"
        in 60..70 ->"C"
        in 70..80 ->"B"
        in 80..90 ->"A"
        in 90..100 ->"S"
        else ->"えらー"
    }
    println(rank)


}