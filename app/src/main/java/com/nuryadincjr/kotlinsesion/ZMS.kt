package com.nuryadincjr.kotlinsesion

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    feedTheTuewlu()
    run(speed = "Lambat")
    dekorasi()
}

fun dekorasi() {
    val decoration = listOf("batu bata", "kayu ex", "kayu puspa")
    val decorationFilter = decoration.filter { it[0] == 'b' }
    println(decorationFilter)

    val decorationMap = decoration.map { println("map: $it") }
    println("first: ${decorationMap.first()}")
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

fun isTooHot(temperatur: Int) = temperatur > 30
fun isDirty(dirty: Int) = dirty > 20;
fun isDay(day: String) = day == "Minggu"

fun dirtySensor() = 20;

fun bersihkanKandang(
    day: String,
    temperatur: Int = 30,
    dirty: Int = dirtySensor()) : Boolean {
    val isTooHot = temperatur > 30
    val isDirty = dirty > 20
    val isDay = day == "Minggu"

    return when {
        isTooHot(temperatur) -> true
        isDirty -> true
        isDay -> true
        else -> false
    }
}