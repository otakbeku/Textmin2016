/*
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package TermFrequency;

/**
 *
 * @author Kotak Hitam
 */
public class TermFrequency {

    double TFd, TFNumber;

    public TermFrequency(double TFd) {
        this.TFd = TFd;
    }

    public TermFrequency() {
    }

    public double getTFd() {
        return TFd;
    }

    public void setTFd(double TFd) {
        this.TFd = TFd;
    }

    public double getTermFrequncy() {

        TFNumber = 1 + Math.log10(TFd);

        return TFNumber;
    }
}
