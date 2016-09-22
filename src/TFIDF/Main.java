/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TFIDF;

import tokenisasi.*;
import java.util.StringTokenizer;

/**
 *
 * @author Kotak Hitam
 */
public class Main {

    public static void main(String[] args) {
        String kalimat = "coba tokenisasi!! teks ini. test!234 6877678hhh ++kaka ll-^ @#$nanana %$$batman";
        tokenizer ubah = new tokenizer();
        ubah.setKalimat(kalimat);
        ubah.cetakToken();

    }
}
