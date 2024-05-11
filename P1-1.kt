fun main() {
    val metin = "Merhaba Dünya!"
    val tersMetin = tersCevir(metin)
    println(tersMetin) // !alnDü ahrebaM
}

fun tersCevir(metin: String): String {
    val tersMetin = StringBuilder()
    for (i in metin.length - 1 downTo 0) {
    	tersMetin.append(metin[i])
    }
    return tersMetin.toString()
}