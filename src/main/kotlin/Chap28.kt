package org.example.chap28

import com.example.chap27.Car
import com.example.chap27.Car5

fun main(args: Array<String>) {
    run {
        println("---28.3---")
        val car = Ferrari("赤")
        car.drive(100.0)
    }
    run {
        println("---28.5---")
        val car = Prius("サバ")
        car.drive(120.0)
    }

}

//28.2
class Ferrari(color: String) : Car5(color) {
    //28.3
    override fun drive(d: Double) {
       distance = distance + d
        println("${color}のフェラーリが走っています！ぶおん")
        println("かっこいい")
        println("マイレージ${distance}キロになった")
    }
}

//28.5
class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っていますね")
        println("静かっす")
        println("トヨタの車はいっぱい走ってもなかなか故障しません。")
    }
}