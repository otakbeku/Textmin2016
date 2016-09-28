/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TFIDF.Preprocessing.Stopword;

import java.util.ArrayList;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static ArrayList<String> wordlist = new ArrayList<String>();
    public static String[] stopwords = {"split", "ini"};

    public static void main(String[] args) {
        /**
         * ngetest split. Bisa ternyata wkwkwk
         */
        String text = "coba klksplit ini split";

        for (String tes : text.split("split")) {
            System.out.print(tes);
        }
        System.out.println("test split");
        String tek = "nananbatman\nnamanananan\nanan";
        String[] k = tek.split("\n ");
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }
        System.out.println("");
        System.out.println("tes dengan removestw");
        removeStw();
        
        System.out.println("sosotyh");
        String[] nanana = null;
        nanana = tek.split("\n");
        for (int i = 0; i < nanana.length; i++) {
            System.out.println(nanana[i]);
        }
        System.out.println("");
        System.out.println("tes baru");
        
        Stopword st = new Stopword("Pembeli bisa memesan makanan dan langsung ambil sesuai order makanan dan jam ambilnya.");
//        st.removeStopwords();
        String hasil = st.getRemovedStopword();
        System.out.println("hasil: "+hasil);
        
//        ArrayList<String> wt = new ArrayList<String>();
//        wt.add(tek.split("\n"));

        //test dengan arraylist
        
    }

    /**
     * buat remove kata. Udah bisa
     */
    public static void removeStw() {
        String test = "coba kliksplit split\n ini";
        test = test.trim().replaceAll("\\s", " ");
        System.out.println("abis di trim: " + test);
        String[] kata = test.split(" ");

        for (String katas : kata) {
            wordlist.add(katas);
        }
        System.out.println("abis loop : " + wordlist);

        for (int i = 0; i < wordlist.size(); i++) {
            for (int j = 0; j < stopwords.length; j++) {
                if (wordlist.contains(stopwords[j])) {
                    wordlist.remove(stopwords[j]);
                    wordlist.remove("");
                }
            }
        }
        String nana = "";
        for (String str : wordlist) {
            nana +=str + " ";
            System.out.println(str + " ");
        }
        System.out.println("nana: "+nana);
//        return null;

        
    }
}
