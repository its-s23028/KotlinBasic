package com.example.chap30

import com.example.chap27.Car5



fun main(args: Array<String>) {
    val car1 = Ferrari("赤")
    val car2 = Prius("ゲレー")
    val car3 = Xbee("黒")
    car1.drive(10.0)
    car2.drive(10.0)
    car3.drive(10.0)

}

abstract class Car(val color:String) {
    var distance = 0.0
    abstract fun drive(d: Double)
}
class Ferrari(color: String) : Car5(color) {
    //28.3
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のフェラーリが走っています！ぶおん")
        println("かっこいい")
        println("マイレージ${distance}キロになった")
    }
}
class Prius(color: String) : Car5(color) {
    override fun drive(d: Double) {
        distance = distance + d
        println("${color}のプリウスが走っていますね")
        println("静かっす")
        println("トヨタの車はいっぱい走ってもなかなか故障しません。")
    }
}
class Xbee(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のクロスビーが走りました")
        println("マイレージは${distance}キロになりまりました")
    }

}