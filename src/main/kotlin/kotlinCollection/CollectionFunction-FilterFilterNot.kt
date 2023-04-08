package kotlinCollection

fun main() {
    val listBilangan = listOf(3, 4, 6, 8, 12, 16, 24, 32)

    val kelipatanTiga = listBilangan.filter { it % 3 == 0 }

    val kelipatanEmpat = listBilangan.filterNot { it % 3 == 0 }

    println("Berikut bilangan kelipatan 3, diantaranya $kelipatanTiga")
    println("Sedangkan untuk bilangan kelipatan 4, diantaranya $kelipatanEmpat")
}