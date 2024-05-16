package org.example

import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {
   println("----14.e2----")

    do {
        val rand = Random.nextInt(0..100)
        println("生成されたかずは$rand です")
    } while (rand > 10)
    println("10未満の数が生成されたのでおわり")
}