/* 
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package Preprocessing.Delimiter;

import java.util.Scanner;

public class delimiter {

// DELIMITER:
//abc…    Letters
//123…    Digits
//\d      Any Digit
//\D      Any Non-digit character
//.       Any Character
//\.      Period
//[abc]   Only a, b, or c
//[^abc]  Not a, b, nor c
//[a-z]   Characters a to z
//[0-9]   Numbers 0 to 9
//\w      Any Alphanumeric character
//\W      Any Non-alphanumeric character
//{m}     m Repetitions
//{m,n}   m to n Repetitions
//*       Zero or more repetitions
//+       One or more repetitions
//?       Optional character
//\s      Any Whitespace
//\S      Any Non-whitespace character
//^…$     Starts and ends
//(…)     Capture Group
//(a(bc)) Capture Sub-group
//(.*)    Capture all
//(ab|cd) Matches ab or cd
    String text;
    Scanner scan = null;

    public delimiter() {

    }

    public delimiter(String text) {
        this.text = text;
        scan = new Scanner(text);
    }

    public void setScan(String text) {
        if (scan == null) {
            this.scan = new Scanner(text);
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String GetDelimiteredText() {
        String text = "";
//        scan.useDelimiter("[ .,?!0123456789\\+\\-*\\^\\@#$%]+");
        scan.useDelimiter("[ 0-9,\\W]+");
        while (scan.hasNext()) {
//            System.out.println(scan.next());
            text += scan.next() + " ";
        }
        scan.close();
        return text;
    }

}
