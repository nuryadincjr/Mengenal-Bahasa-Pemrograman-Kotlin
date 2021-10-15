package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    contohCicak()

    val a = 2
    println(someMethod(a, { println("Funcition lain")}))

    nonInlined {
        println("do something here")
    }

    inlined {
        println("do something here")
    }

}

inline fun someMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2*a
}

data class Cicak(var name: String)

fun contohCicak() {
    val cicak = Cicak("oscar")

    with(cicak.name) {
        println(capitalize())
    }
}


fun nonInlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}

inline fun inlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}