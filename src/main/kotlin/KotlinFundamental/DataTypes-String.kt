package KotlinFundamental

fun main() {
    val shopName = "Toko Afung"
    val thirdChar = shopName[2]

    println("Third character of $shopName is $thirdChar")
    println("_______________________________")

    val sentence = "Ayo \"belajar\" \n\tbersama \nBapak \'S\'aya"
    println(sentence)
    println("_______________________________")

    val newSentence = """
        Belajar Koding
        ---------------------
        Dengan Bapak Saya
        Dijamin Pusing, Trust me
    """.trimIndent()
    println(newSentence)
}