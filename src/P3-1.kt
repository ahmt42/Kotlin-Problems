// Bir kelime veya cümlenin palindrom olup olmadığını kontrol eden bir Kotlin fonksiyonu yazın.

fun main() {
	println(isPalindrom("radar")) // true
	println(isPalindrom("yemek")) // false
}

fun isPalindrom(kelime: String): Boolean {
    // Büyük ve küçük harfleri göz ardı edelim
    val temizKelime = kelime.lowercase().replace(" ", "")

    // Ters çevrilmiş kelimeyi oluşturalım
    val tersKelime = temizKelime.reversed()

    // Kelimeyi ters çevrilmiş haliyle karşılaştıralım
    //return temizKelime == tersKelime
    return temizKelime.equals(tersKelime)
}
