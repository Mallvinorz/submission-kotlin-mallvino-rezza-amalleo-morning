package kotlinControlFlow

fun main() {
//  when expression code 1
    val menuTerpilih = 4

    val menu = when (menuTerpilih) {
        1 -> "Sirloin Steak"
        2 -> "Tenderloin Steak"
        3 -> "Chicken Steak"
        4 -> "Dori Steak"

        else -> "Invalid Number"
    }

    println(menu)
    println("________________________________")

//  when expression code 2
    val pilihAngka = 3

    when (pilihAngka) {
        1,3,5,7,9,11,13,15 -> println("Angka Ganjil")
        else -> println("Angka Genap")
    }
    println("________________________________")

//  when expression code 3
    val pilihPaket = 2

    when (pilihPaket) {
        1 -> {
            println("Happy 130GB 30 hari")
            println("Rp145.000")
            println("Extra TikTok 5GB/5 hari")
        }
        2 -> {
            println("65GB 24 Jam")
            println("Rp100.000")
            println("65GB/30 hari")
        }
        3 -> {
            println("30GB 24 Jam")
            println("Rp65.000")
            println("30GB/30 hari")
        }
        4 -> {
            println("Rahmat 30GB 7 hari")
            println("Rp20.000")
            println("30GB/7 hari")
        }
        5 -> {
            println("Rahmat 3Gb 1 hari")
            println("Rp5.000")
            println("3GB/1 hari")
        }
    }
}