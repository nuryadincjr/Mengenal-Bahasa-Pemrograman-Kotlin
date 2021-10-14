package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    val dataInt = Data<Int>(10)
    val dataString = Data<String>("10")

    val valueInt: Int = dataInt.data
    val valueString: String = dataString.data

    println(valueInt)
    println(valueString)
}

//class GenericClasses {
//    fun get(Int): Int { return 0 }
//}
//
//class mayShortList() {
//    fun get(): Short { return 0}
//}
//
//class myList<T> {
//    fun addItem(T) {}
//}

class Data<T>(val data: T)

