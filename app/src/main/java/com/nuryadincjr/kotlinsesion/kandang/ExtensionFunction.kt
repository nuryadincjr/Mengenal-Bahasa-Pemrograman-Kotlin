package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    extExample()
}

fun String.hasSpaces() = find { it == ' ' } != null
fun String.hasAdd() = find { it == '@' } != null

fun extExample() {
    val show = "Apakah ada spasi disini".hasSpaces()
    val show2 = "nuryadin.cjr@gmail.com".hasAdd()
    println(show)
    println(show2)
}