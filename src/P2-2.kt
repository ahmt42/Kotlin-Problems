// Bir metin dosyasındaki kelimelerin sıklıklarını saydırın ve en sık kullanılan 10 kelimeyi yazdırın.
// 2. çözüm (TreeMap kullanarak)

import java.io.File

fun main() {
    val dosya = File("metin.txt")
    val kelimeSayac = TreeMap<String, Int>()

    dosya.forEachLine { satir ->
        val kelimeler = satir.split(" ") // kelimeleri ayır
        for (kelime in kelimeler) {
            val kucukKelime = kelime.lowercase() // kelimeyi küçük harfe dönüştür
            kelimeSayac[kucukKelime] = kelimeSayac.getOrDefault(kucukKelime, 0) + 1
        }
    }

    // En sık kullanılan 10 kelimeyi yazdır
    for ((kelime, sayac) in kelimeSayac.descendingMap().take(10)) {
        println("$kelime: $sayac")
    }
}
