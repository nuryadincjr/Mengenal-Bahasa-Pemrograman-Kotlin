package com.nuryadincjr.kotlinsesion.kandang

fun main(args: Array<String>) {
    buildKandang()
}

fun buildKandang() {
    val myKandang = Kandang()

    println(
        "Length: ${myKandang.length}, " +
                "width: ${myKandang.width}, " +
                "height: ${myKandang.height}"
    )

    myKandang.height = 20
    println("Height: ${myKandang.height}")

    println("Volume: ${myKandang.volume()} Liter")
}