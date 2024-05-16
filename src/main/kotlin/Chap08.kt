package org.example

fun main(args: Array<String>) {
    val original : Int = 100000

    val a : Byte = original.toByte()
    val b: Short = original.toShort()
    val c : Int = original.toInt()
    val d : Long = original.toLong()
    val e : Float = original.toFloat()
    val f : Double = original.toDouble()
    val g : String = original.toString()
    val h : UByte = original.toUByte()
    val i : UShort = original.toUShort()
    val l : UInt = original.toUInt()
    val m : ULong = original.toULong()

    println("a = $a")
    println("b = $b")
    println("c = $c")
    println("d = $d")
    println("e = $e")
    println("f = $f")
    println("g = $g")
    println("i = $i")
    println("l = $l")
    println("m = $m")


}