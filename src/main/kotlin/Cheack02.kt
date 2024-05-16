package org.example

import kotlin.random.Random


fun main(args: Array<String>) {
    println("1:グー 2:チョキ 3:パー　を選んでください:") //0はグー　１はチョキ　２はパー

    val player = readln().toInt()

    val cpu = Random.nextInt(0,3)

    val age : Int = player - 1
//
//    val judge = when {
//        age == cpu -> "あいこ"
//        age == 0 && cpu == 1 || age == 1 && cpu == 2 || age == 2 && cpu == 0 -> "かち"
//        age == 0 && cpu == 2 || age == 1 && cpu == 0 || age == 2 && cpu == 1 -> "まけ
//
//        else -> "?"
//    }

    val diff = (age - cpu + 3 ) % 3
    val judge = when (diff) {
        0 -> "あいこ"
        1 -> "まけ"
        2 -> "かち"
        else -> '?'
    }
    println("CPU : ${cpu + 1} --- $judge")


}