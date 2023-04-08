package KotlinCollection

fun main() {
    val number = listOf(22, 46, 31, 21, 43, 37, 25, 40, 38)
    val char = listOf('f', 'i', 'e', 's', 't', 'a', 'c', 'h',
        'i', 'c', 'k', 'e', 'n', 'n', 'u', 'g', 'g',
        'e', 't')

    val sortNumber = number.sortedDescending()
    val charSorted = char.sortedDescending()

    println(sortNumber)
    println(charSorted)

}