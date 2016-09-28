/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package Preprocessing.tokenisasi;

import java.util.StringTokenizer;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        String kalimat = "coba tokenisasi!! teks ini. test!234 6877678hhh ++kaka ll-^ @#$nanana %$$batman";
        tokenizer_nonEditted ubah = new tokenizer_nonEditted();
        ubah.setKalimat(kalimat);
        ubah.cetakToken();

        kalimat = "coba tokenisasi!! teks ini. test!234 gjyhkj6877678hhh ++kaka ll-^ @#$nanana %$$batman";
        tokenizer ubah1 = new tokenizer();
        ubah1.setKalimat(kalimat);
        ubah1.cetakToken2();

    }
}
