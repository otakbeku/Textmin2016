/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF;

import BacaFile.BacaFile;
import TFIDF.Preprocessing.Delimiter.Delimiter;
import TFIDF.Preprocessing.IndonesianStemming.Stemming;
import TFIDF.Preprocessing.Stopword.Stopword;
import TFIDF.Preprocessing.tokenisasi.Tokenisasi;
import java.io.File;

import org.apache.lucene.analysis.Tokenizer;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        //preprocessing

        //Inisilisasi dan deklarasi variabel
        File file = new File("doc1.txt");
        BacaFile bf = new BacaFile();
        Delimiter dlmr = new Delimiter();
        Stopword Stw = new Stopword();
        Tokenisasi Tkns = new Tokenisasi();
        Stemming Stm = new Stemming();
        String dokumen = null;
        String[] hasilToken = null;
        String hasilAkhir = "";

        //proses
        //delimiter
        dokumen = bf.getText(file);
//        System.out.println("Dokumen: " + dokumen);
        dlmr.setScan(dokumen);
        dokumen = dlmr.GetDelimiteredText();
//        System.out.println("Dokumen delimiter: " + dokumen);
        //Stopword
        Stw.setDoc(dokumen);
        dokumen = Stw.getRemovedStopword();
//        System.out.println("Dokumen Stopword: " + dokumen);

        //tokenisasi - ditaruh ditahap ini karena hasilnya bisa sesuai kebutuhan.
        Tkns.setKalimat(dokumen);
        hasilToken = Tkns.getTokenNonDelimetered();
//        System.out.println("Dokumen Tokenisasi: " + dokumen);

        //Stemmming
        for (int i = 0; i < hasilToken.length; i++) {
//            System.out.println("hasil token: " + hasilToken[i]);
            Stm.setKata(hasilToken[i]);
            hasilAkhir += Stm.getNonDuplicateText();
        }

        System.out.println("Hasil Akhir: " + hasilAkhir);
    }
}
