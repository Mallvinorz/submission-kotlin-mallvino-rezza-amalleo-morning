package kotlinControlFlow

fun main() {
    for (x in 0..30) {
        if (x >= 8 && x <= 24) {
            continue
        }
    println(x)
    }
}