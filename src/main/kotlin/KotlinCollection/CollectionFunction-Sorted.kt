package KotlinCollection

fun main() {
    val number = listOf(22, 46, 31, 21, 43, 37, 25, 40, 38)
    val char = listOf('f', 'i', 'e', 's', 't', 'a', 'c', 'h',
        'i', 'c', 'k', 'e', 'n', 'n', 'u', 'g', 'g',
        'e', 't')

    val sortNumber = number.sorted()
    val charSorted = char.sorted()

    println(sortNumber)
    println(charSorted)
}