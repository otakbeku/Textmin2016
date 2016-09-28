/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package Preprocessing.Stopword;

import BacaFile.BacaFile;
import java.io.File;
import java.util.ArrayList;

public class Stopword {

    String doc = "";
    String docFixed = "";
    static ArrayList<String> wordList = new ArrayList<String>();
    static String[] stopwords = null;

    File stopwordtext = new File("C:\\Users\\Kotak Hitam\\Documents\\KULIAH\\TEXTMIN\\stopword-1.txt");
    BacaFile bf = new BacaFile(stopwordtext);

    public Stopword() {
        stopwords = bf.getText(stopwordtext).split("\n");
    }

    public Stopword(String doc) {
        this.doc = doc;
        stopwords = bf.getText(stopwordtext).split("\n");
    }

    private void removeStopwords() {
//        this.doc = text;

        this.doc = doc.trim().replace("\\s", " ");
        String[] kata = this.doc.split(" ");

        for (String i : kata) {
            wordList.add(i);
        }

        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < stopwords.length; j++) {
                if (wordList.contains(stopwords[j])) {
                    wordList.remove(stopwords[j]);
                    wordList.remove("");
                }
            }
        }
    }

    private void getKata() {
        for (String str : wordList) {
            this.docFixed += str + " ";
        }
    }

    public String getRemovedStopword() {
        if (this.doc == null) {
            System.out.println("Dokumen tidak ada");
        } else {
            removeStopwords();
            getKata();
        }
        return docFixed;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

}
