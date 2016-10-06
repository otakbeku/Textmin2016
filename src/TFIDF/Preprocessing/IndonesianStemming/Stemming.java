/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF.Preprocessing.IndonesianStemming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

    public String getStemmedText(String kata) {
        char[] charKata = kata.toCharArray();
        int panjangKata = IndStem.stem(charKata, charKata.length, true);
        String stem = new String(charKata, 0, panjangKata);
        return stem;
    }

    public ArrayList<String> setStemmedText(ArrayList<String> Arr) {
        char[] charKata = null;
        for (int i = 0; i < Arr.size(); i++) {
            charKata = Arr.get(i).toCharArray();
            int panjangKata = IndStem.stem(charKata, charKata.length, true);
            String stem = new String(charKata, 0, panjangKata);
            Arr.set(i, stem);
        }
        return Arr;
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

    public ArrayList<String> getNonDuplicateText(ArrayList<String> arr) {
        List<String> listNoDuplicate = arr;
        Set<String> SetNoDulicate = new HashSet<>();
        SetNoDulicate.addAll(listNoDuplicate);
        listNoDuplicate.clear();
        listNoDuplicate.addAll(SetNoDulicate);
        ArrayList<String> hasil = new ArrayList<String>(listNoDuplicate);
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
