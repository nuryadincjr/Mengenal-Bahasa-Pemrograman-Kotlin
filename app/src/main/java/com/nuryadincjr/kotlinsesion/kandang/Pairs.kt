package com.nuryadincjr.kotlinsesion.kandang

fun main(args: Array<String>) {

    val equipment = "keyboard" to "mengetik"
    println(equipment.first)
    println(equipment.second)

    val chainEquipment = "keyboard" to "mengetik" to "mouse" to "napigasi"
    println(chainEquipment)

    val equip = ("keyboard" to "mengetik") to ("mouse" to "napigasi")
    println(equip)
    println(equip.first)
    println(equip.second)

    val keyboard = "keyboard" to "mengetik"
    val (tool, use) = equip
    println("$tool digunakan untuk $use")

    fun useKeybord(): Pair<String, String> {
        return ("keyboor" to "mengetik")
    }

    val (toolkit, used) = useKeybord()
    println(toolkit)
    println(used)

}

