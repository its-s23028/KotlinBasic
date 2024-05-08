package org.example

fun main(args: Array<String>) {
    val delicious = true
    val cheap = false
    println("このレストランは美味しい:${delicious}")
    println("このレストランは安い:${cheap}")
    println(7.2)
    val delicious2 = true
    val cheap2 = true
    val lets_eat2 = (delicious2 && cheap2)
    println("食事する？:$lets_eat2")
    println(7.3)
    val delicious3 = true
    val cheap3 = false
    val lets_eat3 = (delicious3 && cheap3)
    println("食事する？:$lets_eat3")
    println(7.4)
    val delicious4 = false
    val cheap4 = true
    val lets_eat4 = (delicious4 && cheap4)
    println("食事する？:$lets_eat4")
    println(7.5)
    val delicious5 = false
    val cheap5 = false
    val lets_eat5 = (delicious5 && cheap5)
    println("食事する？:$lets_eat5")
    println(7.6)
    val delicious6 = true
    val cheap6 = true
    val lets_eat6 = (delicious6 || cheap6)
    println("食事する？:$lets_eat6")
    println(7.7)
    val delicious7 = true
    val cheap7 = false
    val lets_eat7 = (delicious7 || cheap7)
    println("食事する？:$lets_eat7")
    println(7.8)
    val delicious8 = false
    val cheap8 = true
    val lets_eat8 = (delicious8 || cheap8)
    println("食事する？:$lets_eat8")
    println(7.9)
    val delicious9 = false
    val cheap9 = false
    val lets_eat9 = (delicious9 || cheap9)
    println("食事する？:$lets_eat9")
    println(7.10)
    val x =75
    val a = (x>=50 && x <= 100)
    val b = (x<50 || x >100)
    println("変数　x　が５０から１００の範囲内にある:$a")
    println("変数　x　が５０から１００の範囲外にある:$b")
    println(7.12)
    val a1 = true
    val b2 = !a
    val c = !b
    println("a の値は　${a1}　です。")
    println("b の値は　${b2}　です。")
    println("c の値は　${c}　です。")








}