package org.example

import java.awt.SystemColor.text

fun main(args: Array<String>) {
   /* run {
        println("------22.1------")
        val text = "あいうえお"
        val number = text.toInt()
        println(number)
    }*/
    run {
        println("----22.2+----")
        val text = "-12345"
        val number1 = text.toInt()
        println(number1)
    }
    run {
        println("----22.3----")
        println("input: ")
        val text = readln()
        try {
            val number = text.toInt()
            println("number = $number")
        }catch (e: NumberFormatException) {
            println("「${text}」という文字は整数値に変換できません")
        }
    }
    run {
        println("----22.4---")
        try {
            val number = args[0].toInt()
            println("number = $number")
        } catch (e: NumberFormatException) {
            println("「${args[0]}」という文字は整数値に変換できません")
        }catch (e: ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        }catch (e: Exception) {
            println("想定外の何かがおきました")
        }
    }
    run {
        println("----22.7---")
        println("input: ")
        val text = readln()
        try {
            val number = text.toInt()
            println("number = $number")
        }catch (e: ArrayIndexOutOfBoundsException) {
            println("文字を入力してください")
        }finally {
            println("ありがとう")
        }
    }

}