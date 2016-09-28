/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package IndonesianStemming;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        Stemming st = new Stemming("memberikan");

        String coba = st.getStemmedText();
        System.out.println("coba : " + coba);
    }

}
