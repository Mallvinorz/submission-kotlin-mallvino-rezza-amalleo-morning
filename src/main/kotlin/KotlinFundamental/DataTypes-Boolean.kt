package KotlinFundamental

fun main() {
    var p = false
    var q = false

    println("k && q = " + (p && q)) //false
    println("k || q = " + (p || q)) //false
    println("!k = " + (!p)) //true
    println("_______________________________")

    val a: Int = 35
    val b: Int = 67

    println("a > b = " + (a > b))
    println("a < b = " + (a < b))
    println("a >= b = " + (a >= b))
    println("a <= b = " + (a <= b))
    println("a == b = " + (a == b))
    println("a != b = " + (a != b))
    println("_______________________________")

    val k: Boolean = false
    val l: Boolean = true
    val m: Boolean = false

    println("k.or(l) = " + k.or(l))
    println("k.and(l) = " + k.and(l))
    println("l.and(m) = " + k.and(m))
}