package kotlinControlFlow

fun main() {
    var x = 0

    while (x < 8) {
        println(x + 1)
        x++
    }
    println("____________________________")

    var y = 1
    do {
        println("$y. Hasil kuadrat $y = " + y * y)
        y++
    } while (y <=12)
}