package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    SAM().run()
}

interface Runable {
    fun run()
}

interface Callable<T> {
    fun call(): T
}

class SAM: Runable {
    override fun run() {
        println("tes")
    }
}


