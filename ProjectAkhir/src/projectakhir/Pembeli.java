package projectakhir;

/**
 *
 * @author ardan & wahyu
 */
public abstract class Pembeli implements IBayar{
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public double bayarSekarang(double masukan) {
        double totalBayar = 0;
        return totalBayar;
    }
}
