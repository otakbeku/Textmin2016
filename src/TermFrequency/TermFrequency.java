/*
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TermFrequency;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kotak Hitam
 */
public class TermFrequency {

    Double TFd, TFNumber;
//    ArrayList<String> counter = null;
//    ArrayList<String> hasilToken = null;
    List<String> listToken = null;

    public TermFrequency(double TFd) {
        this.TFd = TFd;
    }

    public TermFrequency(ArrayList<String> counter) {
//        this.counter = counter;
//        this.hasilToken = hasilToken;
        listToken = counter;
    }

    public double getTFd() {
        return TFd;
    }

    public void setTFd(double TFd) {
        this.TFd = TFd;
    }

    public Double getTermFrequency(Integer TFd) {

        TFNumber = 1 + Math.log10(TFd);

        return TFNumber;
    }

    public void setTermFrequency() {
        Map<String, Integer> tabelCounter = new HashMap<String, Integer>();
        Map<String, Double> tabelTF = new HashMap<String, Double>();

        for (String kata : listToken) {
            Integer count = tabelCounter.get(kata);
            tabelCounter.put(kata, (count == null) ? 1 : count + 1);
        }
        this.printTabelCounter(tabelCounter);
//        printMap(tabelCounter);
//        Collection values = tabelCounter.values();

        for (Map.Entry<String, Integer> entry : tabelCounter.entrySet()) {
//            Double TFNumber = 1 + Math.log10(entry.getValue());
            tabelTF.put(entry.getKey(), getTermFrequency(entry.getValue()));
        }
        this.printTabelTF(tabelTF);
    }

    public void printTabelCounter(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Term : " + entry.getKey() + " jumlah : "
                    + entry.getValue());
        }
    }

    public void printTabelTF(Map<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println("Term : " + entry.getKey() + " TFd : "
                    + entry.getValue());
        }
    }
}
