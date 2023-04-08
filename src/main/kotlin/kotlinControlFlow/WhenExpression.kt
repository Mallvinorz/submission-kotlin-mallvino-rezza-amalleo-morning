package kotlinControlFlow

fun main() {
    val menuTerpilih = 4

    val menu = when (menuTerpilih) {
        1 -> "Sirloin Steak"
        2 -> "Tenderloin Steak"
        3 -> "Chicken Steak"
        4 -> "Dori Steak"

        else -> "Invalid Number"
    }

    println(menu)
}