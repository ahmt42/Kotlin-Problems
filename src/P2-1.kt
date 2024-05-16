import java.io.File

fun main() {
    val dosya = File("metin.txt") // Dosya adını değiştirin
    val kelimeSayac = HashMap<String, Int>()

    dosya.forEachLine { satir ->
        val kelimeler = satir.split(" ") // Kelimeleri ayırın
        for (kelime in kelimeler) {
            val kucukKelime = kelime.lowercase() // Kelimeyi küçük harfe dönüştürün
            val sayac = kelimeSayac[kucukKelime] ?: 0 // Sayaç değerini alın veya sıfıra başlatın
            kelimeSayac[kucukKelime] = sayac + 1 // Sayaç değerini güncelleyin
        }
    }

    // En sık kullanılan 10 kelimeyi yazdırın
    val siraliKelimeler = kelimeSayac.entries.sortedByDescending { it.value }
    for ((kelime, sayac) in siraliKelimeler.take(10)) {
        println("$kelime: $sayac")
    }
    
    /*
    val siraliKelimeler = kelimeSayac.entries.sortedByDescending { it.value }.take(10)
    siraliKelimeler.forEach { (kelime, sayac) -> println("$kelime: $sayac") }
    */
}
