package com.nuryadincjr.kotlinsesion.kandang

fun main(args: Array<String>) {
    println(Color.READ.rgb)
    println(Color.GREEN.rgb)
    println(Color.BLUE.rgb)

    harian(Hari.SENIN)

    ikanan(Ikan.Bandeng())
}
enum class Color(val rgb: Int) {
    READ(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Hari{
    JUMAT,
    SABTU,
    AHAD,
    SENIN,
    SELASA,
    RABU,
    KAMIS
}

fun harian(hari: Hari){
    when(hari){
        Hari.SENIN -> println("Senin")
        Hari.SELASA -> println("Selasa")
        Hari.RABU -> println("Rabu")
        Hari.KAMIS -> println("Kamis")
        Hari.JUMAT -> println("Jumat")
        Hari.SABTU -> println("Sabtu")
        Hari.AHAD -> println("Ahad")
    }
}

sealed class Ikan() {
    class Tuna: Ikan()
    class Bandeng: Ikan()
}

fun ikanan(ikan: Ikan) {
    when (ikan) {
        is Ikan.Tuna -> println("Ikan Tuana")
        is Ikan.Bandeng -> println("Ikan Bandeng")
    }
}
