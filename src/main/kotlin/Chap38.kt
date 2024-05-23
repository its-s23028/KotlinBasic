package org.example.chap38

fun main(args: Array<String>) {
    run {
    val c1 = getTextClosure("さん")
    val c2 = getTextClosure("くん")
    val c3 = getTextClosure("ちゃん")

    val name1 = c1("たけし")
    val name2 = c2("たけし")
    val name3 = c3("たけし")

    println(name1)
    println(name2)
    println(name3)
    }
    run {
            val closure = getCountClosure()
            println("クロージャが返した値 =" + closure())
            println("クロージャが返した値 =" + closure())
            println("クロージャが返した値 =" + closure())
    }
    run {
        val closureA = getCountClosure()
        val closureB = getCountClosure()
        println("クロージャがAを返した　＝" + closureA())
        println("クロージャがAを返した　＝" + closureA())
        println("クロージャがAを返した　＝" + closureA())
        println("クロージャがBを返した　＝" + closureB())
        println("クロージャがBを返した　＝" + closureB())
        println("クロージャがAを返した　＝" + closureA())
    }
}

fun getTextClosure(x: String): (String) -> String {
    val caller: (String) -> String = fun(name/*: String*/) = name + x
    return caller
}
fun getCountClosure() : () -> Int {
    var num = 0
    val c : () -> Int = fun() : Int{
        num++
        return num
    }
    return c
}
