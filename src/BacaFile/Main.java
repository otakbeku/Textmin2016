/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package BacaFile;

import java.io.File;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        String[] text = {"askfjlajsdlk", "ajfkjas;dkj;a", "hkjlkdauhl", "hksjfla"};
        String nis = "fgh dtfyguhiuj rdfghj rdfghj rdftgyh jtfyguh jiktfygh ujtf yghuj fghj fgh"
                + "tfytgyhujkl;tygyhjkl"
                + "fgjhkl";
        BacaFile test = new BacaFile();

        test.buatFileInOut();
//        System.out.println("test: " + test.getTulis().toString());
        File Fin = new File(test.getFinDef());
        test.AddTextToFile(Fin, text);
        System.out.println(test.getText(Fin));
//        test.setText(Fin, nis);
        test.AddTextOnNewLine(Fin, nis);
        System.out.println(test.getText(Fin));

    }
}
