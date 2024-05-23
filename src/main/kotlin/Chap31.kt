package org.exmple.chap31

import java.awt.Color

fun main(args: Array<String>) {
    val person = FlyingPerson("たけし",5)
    val car = FlyingCar("赤")
    makeItFly(person)
    makeItFly(car)
}
fun makeItFly(a: Flyable){
    a.fly()
}

interface Flyable {
    fun fly() {
        println("未確認飛行物体です")
    }
}

open class Person(val name: String, val age: Int)

class FlyingPerson(name: String, age: Int) : Person(name, age), Flyable{

}
abstract class Car(val name: String)

class FlyingCar(color: String) : Car(color),Flyable {

}