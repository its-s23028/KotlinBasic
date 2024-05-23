package org.exmple.ckap37

fun main(args: Array<String>) {
    run {
        println("---37.6---")
        val calculator1 = getCalculator("+")
        val calculator2 = getCalculator("-")
        val result1 = calculator1(10.0, 2.0)
        val result2 = calculator2(10.0, 2.0)
        println(result1)
        println(result2)
    }
}

fun getCalculator(type: String): (Double,Double) -> Double {
    val p = fun(x: Double,y:Double) = x + y
    val m = fun(x: Double,y:Double) = x - y
    return when (type) {
        "+" -> p
        else -> m
    }
}