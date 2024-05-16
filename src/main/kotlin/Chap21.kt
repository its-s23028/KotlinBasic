package org.example

fun main(args: Array<String>) {
    run {
//    val answer:Int = getThreTimes(5)
//    println(answer)
//    val answer2: Double = getThreTimes2(5)  エラー吐きコード
        val answer3 = getThreTimes3(5)
        println(answer3)
    }
    run {
        val anser: Int =getTimes(2,3)
        println(anser)
    }
    run {
        val answer2 = getTime1(2,3,4)
        println("変数　answer2の値:" + answer2)
    }
    run{
        printTimes(2, 3)
        printTimes(5, 10, 20)
        printTimes(1, 10, 100, 1000)
        printTimes(2, 2, 2, 2, 2, 2, 2, 2,)
    }
}

//fun getThreTimes(value: Int) :Int {
//    return value * 3
//}
//fun getThreTimes2(Double: Int) :Int {
//    return Double * 3
//}
fun getThreTimes3(value: Int) :Int = value * 10
//21.8
fun getTimes(x: Int, y: Int) = x * y
//21.11
fun getTime1(x: Int, y: Int,z: Int) : Unit {
    println("パラメータとして${x} と ${y} と ${z}を受け取りました")
    println("これらの値を全部掛け算した答えは　${x * y * z}です。")
}
//21.14


fun printTimes(vararg numbers: Int) {
    var result = 1
    for(x in numbers) result *= x
    println("すべてを掛け算したけっか:$result")

}

