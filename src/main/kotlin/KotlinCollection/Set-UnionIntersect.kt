package KotlinCollection

fun main() {
    val A = listOf(2, 3, 5, 7, 11, 13, 17, 19, 23)
    val B = setOf(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21)
    val C = mutableSetOf(10, 23)

    val union = A union B union C
    val intersect = A intersect B

    println(union)
    println(intersect)
}