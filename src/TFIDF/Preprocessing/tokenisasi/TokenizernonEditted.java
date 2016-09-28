/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package tokenisasi;

import java.lang.Object;
import java.util.StringTokenizer;

public class TokenizernonEditted {

    /**
     * CharSequence is an interface String class implement CharSequence
     */
    String delimiter = "[ .,?!0123456789\\+\\-*\\^\\@#$%]+";
    CharSequence delimit = "[.,?!0123456789\\+\\-*\\^\\@#$%]+";
    String kalimat;
    String[] hasilToken = new String[100];

    /**
     * Constructor dengan parameter String untuk langsung mengisi nilai pada
     * variabel kalimat.
     *
     * @param kalimat String; nilai yang digunakan untuk ditokenisasi
     */
    public TokenizernonEditted(String kalimat) {
        this.kalimat = kalimat;
    }

    /**
     * Constructor kosong
     */
    public TokenizernonEditted() {

    }

    /**
     * Method untuk mengset nilai kalimat
     *
     * @param kalimat String; nilai yang digunakan untuk ditokenisasi
     */
    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    /**
     * Method untuk mendapatkan token dari variabale String kalimat.
     */
    private void getToken() {
        hasilToken = kalimat.split(delimiter);
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
        StringTokenizer st = new StringTokenizer(kalimat);
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

    private int countWords() {
        int count = 0;
        boolean CekKata = false;
        int panjangKalimat = this.delimiter.length() - 1;

        for (int i = 0; i < this.delimiter.length(); i++) {
            if (Character.isLetter(this.delimiter.charAt(i)) && i != panjangKalimat) {
                CekKata = true;
            } else if (!Character.isLetter(this.delimiter.charAt(i)) && CekKata) {
                count++;
                CekKata = false;
            } else if (Character.isLetter(this.delimiter.charAt(i)) && i == panjangKalimat) {
                count++;
            }

        }
        return count;
    }
}
