package com.nuryadincjr.kotlinsesion.kandang

abstract class KandangKucing {
    abstract val color: String
}

class Anggora: KandangKucing() {
    override val color = "Yelow"
    fun eat() {
        println("Makan ikan tuna")
    }
}

class Kampung: KandangKucing() {
    override val color = "Silver"
    fun eat() {
        println("Ikan bakar waw")
    }
}

class EatKucing: CatAction {
    override fun eat() {
        println("Ikan Sarden")
    }
}
interface CatAction {
    fun eat()
}