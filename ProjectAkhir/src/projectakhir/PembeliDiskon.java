package projectakhir;

/**
 *
 * @author ardan & wahyu
 */
public class PembeliDiskon extends Pembeli{
    private String nama;

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public double bayarSekarang(double masukkan){
        double diskon = 0.5 * masukkan;
        double hargaFinal = masukkan - diskon; 
        return hargaFinal;
    }
}
