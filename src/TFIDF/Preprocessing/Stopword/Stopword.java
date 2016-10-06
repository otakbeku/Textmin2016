/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF.Preprocessing.Stopword;

import BacaFile.BacaFile;
import java.io.File;
import java.util.ArrayList;

public class Stopword {

    String doc = "";
    String docFixed = "";
    ArrayList<String> wordList = new ArrayList<String>();
    static String[] stopwords = null;
    //Pathnya bisa diganti nanti
    File stopwordtext = null;
    BacaFile bf = null;

    public Stopword() {
        stopwordtext = new File("C:\\Users\\Kotak Hitam\\Documents\\NetBeansProjects\\Textmin2016\\src\\TFIDF\\Preprocessing\\Stopword\\stopword-1.txt");
        bf = new BacaFile(stopwordtext);
        stopwords = bf.getText(stopwordtext).split("\n");

    }

    public Stopword(String doc) {
        this.doc = doc;
        stopwordtext = new File("stopword-1.txt");
        bf = new BacaFile(stopwordtext);
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

    private void removeStopwords(ArrayList<String> hasilToken) {
        this.wordList = hasilToken;
        for (int i = 0; i < hasilToken.size(); i++) {
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

    public ArrayList<String> getRemovedStopword(ArrayList<String> hasilToken) {
        removeStopwords(hasilToken);
        return this.wordList;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

}
