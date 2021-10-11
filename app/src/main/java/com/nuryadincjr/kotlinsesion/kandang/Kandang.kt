package com.nuryadincjr.kotlinsesion.kandang

import java.lang.Math.PI

open class Kandang(var width: Int = 30,
              var height: Int = 60,
              var length: Int = 120) {

    open fun volume() = width * height * length /1000

    open var rumput = volume() * 0.8

    constructor(numberOfAnimals: Int):this() {
        val rumput = numberOfAnimals * 1000
        val kerangka = rumput + rumput * 0.1
        length = (kerangka / (width*height)).toInt()
    }
}

class KandangTower(): Kandang() {
    override var rumput = volume() * 0.4
    override fun volume() = (width * height * length / 100 * PI).toInt()

    fun show() {
        val rumput = KandangTower().rumput
        println(rumput)
    }
}