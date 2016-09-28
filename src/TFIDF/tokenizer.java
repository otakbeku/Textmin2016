/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF;

import Delimiter.delimiter;
import tokenisasi.*;
import java.lang.Object;
import java.util.StringTokenizer;

/**
 * kelas ini hanya untuk melakukan tokenisasi, bukan untuk melakukan
 * penghilangan angka dan tandabaca. kelas ini akan memanggil delimiter dari
 * kelas/package lain.
 *
 * @author Kotak Hitam
 */
public class tokenizer {

    /**
     * CharSequence is an interface String class implement CharSequence
     */
//    String delimiter = "[ .,?!0123456789\\+\\-*\\^\\@#$%]+";
//    CharSequence delimit = "[.,?!0123456789\\+\\-*\\^\\@#$%]+";
    delimiter de = new delimiter();
    String kalimat;
    String[] hasilToken = new String[100];//Asumsi 1 paragraf ada 100 kata
    String hasilDelimiter = null;

    /**
     * Constructor dengan parameter String untuk langsung mengisi nilai pada
     * variabel kalimat.
     *
     * @param kalimat String; nilai yang digunakan untuk ditokenisasi
     */
    public tokenizer(String kalimat) {
        this.kalimat = kalimat;
        de.setScan(this.kalimat);//tambahan baru
    }

    /**
     * Constructor kosong
     */
    public tokenizer() {

    }

    /**
     * Method untuk menset nilai kalimat
     *
     * @param kalimat String; nilai yang digunakan untuk ditokenisasi
     */
    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
        de.setScan(this.kalimat);//tambahan baru
        System.out.println("tst :" + kalimat);
    }

    /**
     * Method untuk mendapatkan token dari variabale String kalimat.
     */
    private void getToken() {
//        hasilToken = kalimat.split(delimiter); // untuk sementara memakai scanner
    }

    /**
     * Method untuk mendapatkan kata yang telah di pisahkan dengan delimiter
     */
    private void getDelimeteredText() {
        this.hasilDelimiter = de.GetDelimiteredText();
    }

    /**
     * Method untuk mencetak token yang telah didapat dari method getToken
     */
    void cetakToken() {
        getToken();
        for (int i = 0; i < hasilToken.length; i++) {
            if (hasilToken[i] != null) {
                System.out.println(hasilToken[i]);
            }
        }

    }

    /**
     * Method untuk mendapatkan token dengan menggunakan StringTokenizer
     */
    private void getToken2() {
        getDelimeteredText();
        System.out.println("tes: " + hasilDelimiter);
        StringTokenizer st = new StringTokenizer(hasilDelimiter);
        int i = 0;
        String[] simpan = new String[1];
        while (st.hasMoreTokens()) {
            hasilToken[i++] = st.nextToken();

        }
    }

    /**
     * Method untuk mencetak token yang didapat dari getToken2
     */
    void cetakToken2() {
        getToken2();
        for (int i = 0; i < kalimat.length(); i++) {
            if (hasilToken[i] != null) {
                System.out.println(hasilToken[i]);
            }
        }
    }

    /**
     * method untuk menghitung jumlah kata dalam 1 kalimat dengan mengecek
     * apakah pada character sekian pada kalimat tersebut adalah letter. selain
     * letter maka hitungan akan naik semisal spasi.
     *
     * @return
     */
    private int countWords() {
        int count = 0;
        boolean CekKata = false;
        int panjangKalimat = this.hasilDelimiter.length() - 1;

        for (int i = 0; i < this.hasilDelimiter.length(); i++) {
            if (Character.isLetter(this.hasilDelimiter.charAt(i)) && i != panjangKalimat) {
                CekKata = true;
            } else if (!Character.isLetter(this.hasilDelimiter.charAt(i)) && CekKata) {
                count++;
                CekKata = false;
            } else if (Character.isLetter(this.hasilDelimiter.charAt(i)) && i == panjangKalimat) {
                count++;
            }

        }
        return count;
    }

}
