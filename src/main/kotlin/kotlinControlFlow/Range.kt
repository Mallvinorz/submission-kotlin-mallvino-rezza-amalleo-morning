package kotlinControlFlow

fun main() {
//    Using ..
    val rangeNilai = 80..100
    println(rangeNilai.toList())

//    Using .rangeTo()
    val range = 80.rangeTo(100)
    println(range.toList())

//    Range step
    val nilai = 80.rangeTo(100) step 3 //default step is 1
    println("Step : " + nilai.step)
    println(rangeNilai.toList())
    println("____________________________________________")

//    rangeTo() & downTo()
    val a = 30
    if (a !in 80.rangeTo(100)) {
        println("Dipersilahkan mengikuti perbaikan nilai")
    }

    val b = 79
    val hasilB = if (b in 100.downTo(80)) {
        println("Aman cuy")
    } else {
        "Better luck next time"
    }

    println("Hasil Ujian : $hasilB")
}
