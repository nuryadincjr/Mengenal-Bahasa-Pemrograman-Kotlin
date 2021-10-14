package com.nuryadincjr.kotlinsesion.kandang

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    println(number)
    number.add("empat")
    number.remove("dua")
    println(number.contains("dua"))
    println(number)

    println(numberOfInt)
    println(numberOfInt.sum())

    println(equipment["mengetik"])
    println(equipment.getOrDefault("sketching", "Not fond"))

    equipmentOf.put("sketching", "paint")
    equipmentOf.remove("navigasi")
}

val number = mutableListOf("satu", "dua", "tiga")
val numberOfInt = listOf(1,2,3)

val equipment = mapOf("mengetik" to "keybore", "navigasi" to "mouse")
val equipmentOf = mutableMapOf("mengetik" to "keybore", "navigasi" to "mouse")