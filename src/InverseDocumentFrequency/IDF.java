/*
 * Setiap baris kode ini berada di bawah tanggung jawab penulis
 * Jika ada salah segera hubungi penulis. Terima kasih
 * Menerima saran. Feel free to forking and make your own.
 * site: otakbeku.github.io/Textmin2016/
 */
package InverseDocumentFrequency;

/**
 *
 * @author Kotak Hitam
 */
public class IDF {

    double N, DFt;
    double IDFNumber = 0;

    public IDF() {
    }

    public IDF(double N, double DFt) {
        this.N = N;
        this.DFt = DFt;
    }

    public double getN() {
        return N;
    }

    public void setN(double N) {
        this.N = N;
    }

    public double getDFt() {
        return DFt;
    }

    public void setDFt(double DFt) {
        this.DFt = DFt;
    }

    public double getIDF() {
        double bagi = N / DFt;
        IDFNumber = Math.log10(bagi);
        return IDFNumber;
    }

}
