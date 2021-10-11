package com.nuryadincjr.kotlinsesion.kandang

class Kandang(var width: Int = 30,
              var height: Int = 60,
              var length: Int = 120) {

//    var width: Int = width
//    var height: Int = height
//    var length: Int = length

    fun volume() = width * height * length /1000

    constructor(numberOfAnimals: Int):this() {
        val rumput = numberOfAnimals * 1000
        val kerangka = rumput + rumput * 0.1
        length = (kerangka / (width*height)).toInt()
    }
}