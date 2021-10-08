package com.nuryadincjr.kotlinsesion

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    feedTheTuewlu()
}

fun feedTheTuewlu() {
    val day = randomDay()
    val food = simbaFood(day)
    println("Hari ini adalah hari $day jadi Simba makan $food")
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

//    sebelum penyederhanaan
//    return foodvar food = "Puasa"
//    when(day) {
//        "Senin" -> food = "Ikan asin"
//        "Selasa" -> food = "Sayur kol"
//        "Rabu" -> food = "Nasi padang"
//        "Kamis" -> food = "Karo uyah"
//        "Jum'at" -> food = "Susu beruang"
//        "Minggu" -> food = "Nasi goreng"
//    }
//    return food
}

fun randomDay()  : String {
    val week = listOf("Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "sabtu", "Minggu")
    return week[Random().nextInt(7)]
}
