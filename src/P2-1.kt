// 1. çözüm (HashMap kullanarak)

import java.io.File

fun main() {
    val dosya = File("metin.txt")
    val kelimeSayac = HashMap<String, Int>()

    dosya.forEachLine { satir ->
        val kelimeler = satir.split(" ") // kelimeleri ayır
        for (kelime in kelimeler) {
            val kucukKelime = kelime.lowercase() // kelimeyi küçük harfe dönüştür
            val sayac = kelimeSayac[kucukKelime] ?: 0 // sayaç değerini al veya sıfırla başlat
            kelimeSayac[kucukKelime] = sayac + 1 // sayaç değerini güncelle
        }
    }

    // en sık kullanılan 10 kelimeyi yazdır
    val siraliKelimeler = kelimeSayac.entries.sortedByDescending { it.value }
    for ((kelime, sayac) in siraliKelimeler.take(10)) {
        println("$kelime: $sayac")
    }
    
    /*
    val siraliKelimeler = kelimeSayac.entries.sortedByDescending { it.value }.take(10)
    siraliKelimeler.forEach { (kelime, sayac) -> println("$kelime: $sayac") }
    */
}
