package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    val dataInt = Data<Int>(10)
    val dataString = Data<String>("10")

    val valueInt: Int = dataInt.data
    val valueString: String = dataString.data

    println(valueInt)
    println(valueString)

    myList<String>().isData<String>("Big data $valueString")
}

class myList<T> {
    fun<T> isData(Data: T) {
        println("Show data $Data")
    }
}

class Data<T>(val data: T)

