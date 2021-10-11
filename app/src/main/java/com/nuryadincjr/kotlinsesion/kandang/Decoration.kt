package com.nuryadincjr.kotlinsesion.kandang

fun main(args: Array<String>) {
    makeDecoration()
}
fun makeDecoration() {
    val dec1 = Decoration("Batu-Bata")
    println(dec1)

    val dec2 = Decoration("Batu-Akik")
    println(dec2)

    val dec3 = Decoration("Batu-Akik")
    println(dec3)

    println(Decoration("Marmer") == Decoration("Marmer"))
    println(dec2 == dec3)

    val dec4 = dec3.copy()
    println(dec4)

    val dec5 = DecorationNew("Batu-Ginjal", "Jati", "Eurih")
    println(dec5)

    val(rocks, wood, grass) = dec5

    println(rocks)
    println(wood)
    println(grass)
}

data class Decoration(val rocks: String)

data class DecorationNew(val rocks: String, val wood: String, val grass: String)