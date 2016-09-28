/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package Stopword;

import BacaFile.bacafile;
import java.io.File;
import java.util.ArrayList;

public class stopword {

    String doc = "";
    String docFixed = "";
    static ArrayList<String> wordList = new ArrayList<String>();
    static String[] stopwords = null;

    File stopwordtext = new File("C:\\Users\\Kotak Hitam\\Documents\\KULIAH\\TEXTMIN\\stopword-1.txt");
    bacafile bf = new bacafile(stopwordtext);

    public stopword() {
        stopwords = bf.getText(stopwordtext).split("\n");
    }

    public stopword(String doc) {
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

}
