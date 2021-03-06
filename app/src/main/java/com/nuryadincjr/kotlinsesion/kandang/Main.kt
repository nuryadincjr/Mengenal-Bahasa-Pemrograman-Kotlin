package com.nuryadincjr.kotlinsesion.kandang

fun main(args: Array<String>) {
    buildKandang()
    KandangTower().show()
    makeCat()
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

    val smallKandang = Kandang(10, 20, 30)
    println("Small Kandang: ${smallKandang.volume()} Liter")

    val myKandang2 = Kandang(numberOfAnimals = 9)
    println("Volume: ${myKandang2.volume()} Liter "
    + "Length ${myKandang2.length} cm")
}

fun feedCat(cat: CatAction) {
        cat.eat()
}

fun makeCat() {
    val anggora = Anggora()
    val kampung = Kampung()
    val makan = EatKucing()

    println("Anggora: ${anggora.color} \n" +
            "Kampung: ${kampung.color}")
    anggora.eat()
    kampung.eat()

    makan.eat()

}