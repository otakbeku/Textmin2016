/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package BacaFile;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        bacafile test = new bacafile();
        
        test.buatFileInOut();
//        System.out.println("test: " + test.getTulis().toString());
        File Fin = new File(test.getFinDef());
        test.setText(Fin, text);
        System.out.println(test.getText(Fin));
//        test.setText(Fin, nis);
        test.AddText(Fin, nis);
        System.out.println(test.getText(Fin));
        
    }
}
