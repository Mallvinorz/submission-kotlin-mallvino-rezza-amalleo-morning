package kotlinControlFlow

fun main() {
    var x = 17
    while (true) {
        println("index $x")
        x--
        if (x % 9 == 0) {
            break
        }
    }
    println("_______________________")

    val y = 11
    for (z in 3..17) {
        println("Spontan!")
        if (z - y >= 0) {
            println("Uhuyyyy.....")
            break
        }
    }
}