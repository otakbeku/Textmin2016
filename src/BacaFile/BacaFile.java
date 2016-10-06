/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package BacaFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;

public class BacaFile {

    private Formatter baca, tulis;
    String FoutDef = "D:\\FileTulis.txt";
    String FinDef = "D:\\FileBaca.txt";

    File file;

    public BacaFile() {

    }

    public BacaFile(File file) {
        this.file = file;
    }

    public String getText(File baca) {
        String no = "";
        File dibaca = baca;
        if (dibaca == null) {
            System.out.println("gabisa");
        }
        if (!dibaca.exists() || !dibaca.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            BufferedReader in = new BufferedReader(new FileReader(dibaca));
            String line;
            while ((line = in.readLine()) != null) {
                no += line + "\n";
            }
            in.close();

        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca");
            no += e.toString();
        }
        return no;
    }

    public void AddTextOnNewLine(File tulis, String[] fill) {
//        System.out.println("fill.length: "+fill.length);
        File ditulis = tulis;
        int i = 0;
        if (!ditulis.exists() || !ditulis.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            FileWriter fwOut = new FileWriter(ditulis);
            BufferedWriter bwOut = new BufferedWriter(fwOut);
            PrintWriter pwOut = new PrintWriter(bwOut);

            while (i < fill.length) {
//                System.out.println("fill: "+i+" "+fill[i]);
//                bwOut.write(fill[i]);
//                bwOut.newLine();
                pwOut.println(fill[i++]);
//                i += 1;
            }
            bwOut.close();

        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca: " + e);
        }
    }

    public void AddTextToFile(File tulis, String fill) {

        File ditulis = tulis;
        int i = 0;
        if (!ditulis.exists() || !ditulis.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(ditulis));

            out.write(fill);
            out.close();

        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca: " + e);
        }
    }

    public void AddText(File tulis, String append) {
        File dibaca = tulis;
        File ditulis = tulis;
        int i = 0;
        if (!ditulis.exists() || !ditulis.canRead()) {
            System.out.println("File tidak ada");
        }
        try {
            FileWriter fwOut = new FileWriter(ditulis,true);
            BufferedWriter bwOut = new BufferedWriter(fwOut);
            PrintWriter pwOut = new PrintWriter(bwOut);

//            out.write(append);
            pwOut.println(append);
            bwOut.close();

        } catch (Exception e) {
            System.out.println("File tidak dapat terbaca: " + e);
        }
    }

    public void buatFileIn(String namaFile) {
        try {
            baca = new Formatter("D:\\" + namaFile + ".txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public void buatFileIn() {
        try {
            baca = new Formatter("D:\\FileBaca.txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public void buatFileOut(String namaFile) {
        try {
            tulis = new Formatter("D:\\" + namaFile + ".txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public void buatFileOut() {
        try {
            tulis = new Formatter("D:\\FileTulis.txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public void buatFileInOut(String Fin, String Fout) {
        try {
            baca = new Formatter("D:\\" + Fin + ".txt");
            tulis = new Formatter("D:\\" + Fout + ".txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public void buatFileInOut() {
        try {
            baca = new Formatter("D:\\FileBaca.txt");
            tulis = new Formatter("D:\\FileTulis.txt");
            System.out.println("File Berhasil dibuat");
        } catch (Exception e) {
            System.out.println("File gagal dibuat: " + e);
        }
    }

    public Formatter getBaca() {
        return baca;
    }

    public void setBaca(Formatter baca) {
        this.baca = baca;
    }

    public Formatter getTulis() {
        return tulis;
    }

    public void setTulis(Formatter tulis) {
        this.tulis = tulis;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFoutDef() {
        return FoutDef;
    }

    public String getFinDef() {
        return FinDef;
    }
}