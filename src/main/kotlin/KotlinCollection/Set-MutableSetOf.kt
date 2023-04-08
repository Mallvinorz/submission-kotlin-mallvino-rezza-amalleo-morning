package KotlinCollection

fun main() {
    val size = mutableSetOf("Small", "Regular", "Large", "Extra Large")

    size.remove("Extra Large")
    size.add("Venti")

    println(size)

}