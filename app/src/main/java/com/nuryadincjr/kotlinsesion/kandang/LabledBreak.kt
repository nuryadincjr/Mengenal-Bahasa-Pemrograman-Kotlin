package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    lables()
}

fun lables() {
    loop@for (i in 1..10) {
        for (j in 1..5) {
            println("looping ke $i dan $j")
            if (i > 3) break@loop
        }
    }
}