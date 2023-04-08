package KotlinCollection

fun main() {
    val shoesSize = mutableListOf(42, 43, 45, 46)
    println(shoesSize)

    shoesSize[3] = 62
    println(shoesSize)
}