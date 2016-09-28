/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package IndonesianStemming;

import org.apache.lucene.analysis.id.IndonesianStemmer;

/**
 *
 * @author Kotak Hitam
 */
public class Stemming {

    IndonesianStemmer IndStem = null;

    static String kata = null;

    public Stemming() {
        IndStem = new IndonesianStemmer();
    }

    public Stemming(String text) {
        kata = text;
        IndStem = new IndonesianStemmer();
    }

    public String getStemmedText() {
        char[] charKata = kata.toCharArray();
        int panjangKata = IndStem.stem(charKata, charKata.length, true);
        String stem = new String(charKata, 0, panjangKata);
        return stem;
    }

    public String getStemmedDocument(String document) {

        kata = document;
        return null;
    }

}
