//@file:JvmName("Zoo Management System")

package com.nuryadincjr.kotlinsesion.kandang

fun main() {
    Annotations()
    Annotations.myStatis()
    Annotations.unStatis()

    Annotations.Companion.myStatis()
    Annotations.Companion.unStatis()

}

class Annotations {
    companion object {
        @JvmStatic
        fun myStatis() {
            println("Static anotation")
        }

        fun unStatis() {
            println("Tidak Static anotation")
        }
    }
}