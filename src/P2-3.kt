// Bir metin dosyasındaki kelimelerin sıklıklarını saydırın ve en sık kullanılan 10 kelimeyi yazdırın.
// 3. çözüm

import java.io.File

fun main() {
    val dosya = File("metin.txt")
    val kelimeSayac = mutableListOf<Pair<String, Int>>()

    dosya.forEachLine { satir ->
        val kelimeler = satir.split(" ") // kelimeleri ayır
        for (kelime in kelimeler) {
            val kucukKelime = kelime.lowercase() // kelimeyi küçük harfe dönüştür
            val eslesme = kelimeSayac.find { it.first == kucukKelime }
            if (eslesme != null) {
                eslesme.second++ // mevcut kelimeyi bulduysak sayacını artır
            } else {
                kelimeSayac.add(Pair(kucukKelime, 1)) // yeni kelimeyi ve sayacını ekle
            }
        }
    }

    // en sık kullanılan 10 kelimeyi yazdır
    val siraliKelimeler = kelimeSayac.sortedByDescending { it.second }.take(10)
    for ((kelime, sayac) in siraliKelimeler) {
        println("$kelime: $sayac")
    }
}
