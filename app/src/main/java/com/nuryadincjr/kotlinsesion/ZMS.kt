package com.nuryadincjr.kotlinsesion

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    feedTheTuewlu()
    run(speed = "Lambat")
}

fun feedTheTuewlu() {
    val day = randomDay()
    val food = simbaFood(day)
    println("Hari ini adalah hari $day jadi Simba makan $food")

    bersihkanKandang(day, 20, 40)
    bersihkanKandang(day)
    bersihkanKandang(day, dirty = 30)
    if (bersihkanKandang(day)) {
        println("Bersihkan kandang hari ini")
    }
}

fun simbaFood(day: String) : String {
    return when(day) {
        "Senin" -> "Ikan asin"
        "Selasa" ->  "Sayur kol"
        "Rabu" ->  "Nasi padang"
        "Kamis" -> "Karo uyah"
        "Jum'at" -> "Susu beruang"
        "Minggu" -> "Nasi goreng"
        else -> "Puasa"
    }
}

fun randomDay()  : String {
    val week = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "sabtu", "Minggu")
    return week[Random().nextInt(7)]
}

fun run(time : Int = 50, speed : String = "Kencang") {
    println("Simba lari sangat $speed dengan kecepatan $time")
}

fun bersihkanKandang(
    day: String,
    temperatur: Int = 30,
    dirty: Int = 20) : Boolean {
    return true
}