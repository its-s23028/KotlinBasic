package com.example.chap26

import java.time.LocalDate
import java.time.LocalDateTime

fun main(args: Array<String>) {
    // プライマリコンストラクタのみを使う場合
    //まじBookがないと始まらない。
    val book = Book(
        100,
        "優しいことりん入門",
        "野崎栄一",
        LocalDate.of(2018,5,10)
    )
    //2.貸出情報　Rentalをつくる
    val rental = Rental(
        book.id,
        "たけし",
        LocalDateTime.now(),
        LocalDateTime.of(2024,5,28,12,30)
    )
    //3.book と　rental を合わせた　Bookrental を作る
    val bookWithRental = BookWithRental(
        book, rental
    )
    //4.まとめた　Bookwithrental をつかって
    val bookInfo = BookInfo(
        bookWithRental.book.id,
        bookWithRental.book.title,
        bookWithRental.book.author,
        bookWithRental.isRental
    )
    //5.中身を表示
    bookInfo.printInfo()
}
class BookInfo(
    val id: Long,
    val title: String,
    val author: String,
    val isRental: Boolean,
) {
    fun printInfo() {
        println(
            """
                [ID: $id] $title (${author})
                ${if (isRental) "貸出中です" else "貸出可能です"}
            """.trimIndent()
        )
    }
}

class Book(
    val id: Long,
    val title: String,
    val author: String,
    val releaseDate: LocalDate,
)

class Rental(
    val bookId:Long,
    val userName: String,
    val rentalDateTime: LocalDateTime,
    val rentalDeadline: LocalDateTime,
)
class BookWithRental(
    val book: Book,
    val rental: Rental?

){
    val isRental: Boolean
        get() = rental != null

}
class RentalInfo(
    val userName: String,
    val rentalDate: LocalDateTime,
    val returnDeadline: LocalDateTime
)