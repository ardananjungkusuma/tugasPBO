package projectakhir;

/**
 *
 * @author ardan & wahyu
 */
public class PembeliBiasa extends Pembeli{
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
        return masukkan;
    }
}
