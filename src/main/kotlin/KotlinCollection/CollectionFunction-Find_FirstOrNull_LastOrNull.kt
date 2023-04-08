package KotlinCollection

fun main() {
    val number = listOf(22, 46, 31, 21, 43, 37, 25, 40, 38)

    val findNumber = number.find { it % 4 == 1 }
    val firstOrNullNumber = number.firstOrNull { it % 3 == 1 }
    val lastOrNullNumber = number.lastOrNull { it % 3 == 1 }

    println("Ini Find Number = $findNumber")
    println("Ini First Or Null Number = $firstOrNullNumber")
    println("Ini Last Or Null Number = $lastOrNullNumber")
}