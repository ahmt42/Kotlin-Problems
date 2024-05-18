// Bir kelime veya cümlenin palindrom olup olmadığını kontrol eden bir Kotlin fonksiyonu yazın.

fun main() {
    val ornek1 = "A man, a plan, a canal, Panama"
    val ornek2 = "Hello, World!"

    println("Girdi: \"$ornek1\" Palindrom mu? ${isPalindrom(ornek1)}")
    println("Girdi: \"$ornek2\" Palindrom mu? ${isPalindrom(ornek2)}")
}

fun isPalindrom(girdi: String): Boolean {
    // Girdiyi temizle: boşlukları ve noktalama işaretlerini kaldır, tüm harfleri küçük harfe çevir
    val temizGirdi = girdi
        .replace(Regex("[^A-Za-z0-9]"), "")
        .lowercase()

    // Girdiyi ters çevirin
    val tersGirdi = temizGirdi.reversed()

    // Orijinal ve ters çevrilmiş girdiyi karşılaştırın
    return temizGirdi == tersGirdi
}
