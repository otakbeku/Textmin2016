package tokenisasi;

import java.lang.Object;
import java.util.StringTokenizer;

public class tokenizer {

    String kalimat;
    String[] hasilToken = new String[100];

    public tokenizer(String kalimat) {
        this.kalimat = kalimat;
    }

    public tokenizer() {

    }

    public void setKalimat(String kalimat) {
        this.kalimat = kalimat;
    }

    private void getToken() {
        StringTokenizer st = new StringTokenizer(kalimat);
        int i = 0;
        while (st.hasMoreTokens()) {
            hasilToken[i++] = st.nextToken();
        }

    }

    private void getToken2() {
        StringTokenizer st = new StringTokenizer(kalimat);
        int i = 0;

        while (st.hasMoreTokens()) {
            hasilToken[i] = st.nextToken();
            if (hasilToken[i].contains(".") == true) {

            }
            i++;
        }

    }

    /** 
     * Method untuk memisahkan karakter atau tanda baca dengan alphabet
     * @param kata 
     */
    private void splitter(String kata) {
        String[] simpan = new String[2];
        if (kata.contains(".")) {
            
        }
        if (kata.contains("?")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        if (kata.contains(".")) {
            
        }
        
        simpan = kata.split("\\.");
    }

    void cetakToken() {
        getToken();
        for (int i = 0; i < kalimat.length(); i++) {
            if (hasilToken[i] != null) {
                System.out.println(hasilToken[i]);
            }
        }
    }

    void cetakToken2() {
        getToken2();
        for (int i = 0; i < kalimat.length(); i++) {
            if (hasilToken[i] != null) {
                System.out.println(hasilToken[i]);
            }
        }
    }

}
