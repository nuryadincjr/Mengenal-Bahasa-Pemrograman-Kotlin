package com.nuryadincjr.kotlinsesion

import java.util.*

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    feedTheTuewlu()
}

fun feedTheTuewlu() {
    val day = randomDay()
    val food = "Cap Cay"
    println("Hari ini adalah hari $day jadi Simba makan $food")
}

fun randomDay()  : String {
    val week = listOf("senin", "selasa", "Rabu", "Kamis", "Jum'at", "sabtu", "Minggu")
    return week[Random().nextInt(7)]
}
