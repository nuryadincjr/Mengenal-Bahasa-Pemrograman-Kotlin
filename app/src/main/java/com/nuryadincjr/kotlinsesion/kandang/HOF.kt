package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    contohCicak()
}

data class Cicak(var name: String)

fun contohCicak() {
    val cicak = Cicak("oscar")

    with(cicak.name) {
        println(capitalize())
    }
}