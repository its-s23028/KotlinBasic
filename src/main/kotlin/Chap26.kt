package org.exmple.chap26

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

fun main(args: Array<String>) {
    //プライマリコンストラクトのみ使った場合
    val book = Book("やさしい　Kotolin 入門", "野沢　まさこ",
        LocalDate.of(2018, 5, 10),
    RentalInfo(
        "たけし", LocalDateTime.now(),
        LocalDateTime.of(LocalDate.of(2024, 5, 31), LocalTime.of(12, 0, 0)),
        )
    )
}
class Book(
    val title: String,
    val author: String,
    val releaseDate: LocalDate,
    val rentalInfo: RentalInfo
) {
    fun printInfo() {
        println("""
            ----------------------
            $title
            $releaseDate 初版
            著者　$author
            ----------------------
            貸出情報
            ----------------------
            借りてるユーザー: ${rentalInfo.userName}
            借りた日:　${rentalInfo.rentalDate}
            返却期限: ${rentalInfo.returnDeadline}
        """.trimIndent())
    }
}
class RentalInfo(
    val userName: String,
    val rentalDate: LocalDateTime,
    val returnDeadline: LocalDateTime
) {
}