package KotlinCollection

fun main() {
    val list = listOf<Float>(3.5f, 4.4f, 1.2f, 3.4f )

    val pangkatDua = list.map { it * it }

    println(pangkatDua)
}