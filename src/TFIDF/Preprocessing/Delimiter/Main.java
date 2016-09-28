/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF.Preprocessing.Delimiter;

/**
 *
 * @author Kotak Hitam
 */
public class Main {
    public static void main(String[] args) {
        Delimiter dee = new Delimiter("345AFid546 fgh@#$gh 4567ghj#$%^ ");
        System.out.println("text: "+dee.GetDelimiteredText());
    }
    
}
