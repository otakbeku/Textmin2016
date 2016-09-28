/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package Preprocessing.IndonesianStemming;

import org.apache.lucene.analysis.id.IndonesianStemmer;

/**
 *
 * @author Kotak Hitam
 */
public class Stemming {

    IndonesianStemmer IndStem = null;

    String kata = null;

    public void setKata(String kata) {
        this.kata = kata;
    }

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

    public String getNonDuplicateText() {
        String hasil = "";
        if (this.kata != null) {
            String[] words = this.kata.split("\\s");

            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        if (i != j) {
                            words[i] = "";
                        }
                    }
                }
            }
            for (int i = 0; i < words.length; i++) {

                if (words[i] != "") {
                    hasil += words[i] + " ";

                }
            }
        }

        return hasil;
    }

    /**
     * Methodnya belum fix bisa
     *
     * @param document
     * @return
     */
    public String getStemmedDocument(String document) {

        kata = document;
        return null;
    }

}
