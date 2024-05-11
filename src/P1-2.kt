fun main() {
    val metin = "Merhaba Dünya!"
    val tersMetin = tersCevir(metin)
    println(tersMetin) // !alnDü ahrebaM
}

fun tersCevir(metin: String): String {
	return metin.reversed()
}