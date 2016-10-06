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
import java.util.ArrayList;

/**
 *
 * @author Kotak Hitam
 */
public class PreprocessingWeightingTFIDF {

    File file = null;
    BacaFile bf = new BacaFile();
    Delimiter dlmr = new Delimiter();
    Stopword Stw = new Stopword();
    Tokenisasi Tkns = new Tokenisasi();
    Stemming Stm = new Stemming();
    String dokumen = null;
//    String[] hasilToken = null;
    String hasilAkhir = "";
    ArrayList<String> hasilToken = new ArrayList<String>();
    ArrayList<String> counter = new ArrayList<String>();

    public void preprocessing() {
        if (file == null) {
            System.out.println("Operasi tidak bisa di jalankan");
        } else {
            dokumen = bf.getText(file);
            Tkns.setTokenDelimetered(dokumen);
            hasilToken = Tkns.getHasilToken();
            hasilToken = Stw.getRemovedStopword(hasilToken);
            hasilToken = Stm.setStemmedText(hasilToken);
            counter = hasilToken;
            hasilToken = Stm.getNonDuplicateText(hasilToken);

        }
    }

    public PreprocessingWeightingTFIDF(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
