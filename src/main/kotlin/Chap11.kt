package org.exampl

fun main(args: Array<String>) {
    val a =5
    val b = 5

    if (a < b) {
        println("a の方が b よりも小さいです")
    }else if (a > b) {
        println("aの方が ｂよりも大きいです")
    } else {
        println("aとbの値は一緒")

    }
    println("-----11.9------")
    val age = 14
    if (age in 13..15) {
        println("一番目の処理が行われました")
        "中学生です"
    }else {
        println("二番目の条件の処理が行われました")
        "中学生ではありません"
    }

}