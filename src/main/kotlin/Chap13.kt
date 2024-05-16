package org.exmple

fun main(args: Array<String>) {
    val x =5
//    println("${x}かける１は、${x*1}です。")
//    println("${x}かける2は、${x*2}です。")
//    println("${x}かける3は、${x*3}です。")
//    println("${x}かける4は、${x*4}です。")
//    println("${x}かける5は、${x*5}です。")
//    println("${x}かける6は、${x*6}です。")
//    println("${x}かける7は、${x*7}です。")
//    println("${x}かける8は、${x*8}です。")
//    println("${x}かける9は、${x*9}です。")
    println("----13.2----")
    for (i in 1..9) {
        println("${x}かける${i}は、${x*i}です")
    }
    println("----13.５----")
    for (i in 800..1000 step 3) {
        println("${x}かける${i}は、${x*i}です")
    }
    println("----13.7----")
    for (i in 9 downTo 1) {
        println("${x}かける${i}は、${x*i}です")
    }
    println("----13.8----")
    for (i in 9 downTo 1 step 2) {
        println("${x}かける${i}は、${x*i}です")
    }

}