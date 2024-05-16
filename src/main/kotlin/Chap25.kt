package org.example.Chap25

fun main(args: Array<String>) {
    run {
        println("---25.2---")
        val p = Person2("たけし",5)
        p.greet()
    }
    run {
        println("---25.5---")
        val p = Person2(name = "たけし",age = 5)
        p.greet()
    }
    run {
        println("---25.6---")
        val p = Person2(age = 5, name = "たけし")
        p.greet()
    }
    run {
        println("---25.6.1---")
        val p = Person2(name = "たけし")
        p.greet()
    }
    run {
        println("---25.6.2---")
        val p = Person2(age = 20)
        p.greet()
    }
    run {
        println("---25.7---")
        val p1 = Person()
        val p2 = Person(name = "たかし")
        val p3 = Person(age = 7)
        p1.greet()
        p2.greet()
        p3.greet()
    }
    run {
        println("---25.8---")
        val p1 = Person8("たけし",7)
        val p2 = Person8(name = "たけし", age = 7)
        val p3 = Person8(age = 7, name = "たけし")
        p1.greet()
        p2.greet()
        p3.greet()
    }
    run {
        println("---25.9---")
        val p1 = Person9("たけし", 7)
    }


}
class Person2 (var name: String = "", var age: Int = 0) {
    fun greet() {
        println("${name}です。${age}歳です")
    }
}
class Person(var name: String = "名無しさん", var age: Int = 20) {
    fun greet() {
        println("${name}は、${age}歳です。")
    }
}
class Person8 (var name: String, var age: Int) {
    fun greet() {
        println("${name}です、${age}歳です")
    }
}
class Person9(val name: String, var age: Int) {
    init {
        println("コンストラクタのイニシャライザが呼ばれました。")
        greet()
    }
    fun greet() {
        println("${name}です。${age}です。")
    }
}