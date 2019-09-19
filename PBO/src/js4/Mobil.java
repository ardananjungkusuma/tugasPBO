package js4;

/**
 *
 * @author ardan
 */
public class Mobil {
    private String namaMobil;
    private int biayaMobil;
    
    public Mobil(){
        
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public int getBiayaMobil() {
        return biayaMobil;
    }

    public void setBiayaMobil(int biayaMobil) {
        this.biayaMobil = biayaMobil;
    }
    
    public int hitungBiayaMobil(int hari){
        return biayaMobil*hari;
    }
    
}
