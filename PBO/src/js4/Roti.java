package js4;

/**
 *
 * @author ardan
 */
public class Roti {
    private String idRoti;
    private String namaRoti;
    private String rasaRoti;
    private int hargaRoti;

    public Roti(){
        
    }
    
    public Roti(String idRoti, String namaRoti, String rasaRoti, int hargaRoti) {
        this.idRoti = idRoti;
        this.namaRoti = namaRoti;
        this.rasaRoti = rasaRoti;
        this.hargaRoti = hargaRoti;
    }
    
    public String getIdRoti() {
        return idRoti;
    }

    public void setIdRoti(String idRoti) {
        this.idRoti = idRoti;
    }

    public String getNamaRoti() {
        return namaRoti;
    }

    public void setNamaRoti(String namaRoti) {
        this.namaRoti = namaRoti;
    }

    public String getRasaRoti() {
        return rasaRoti;
    }

    public void setRasaRoti(String rasaRoti) {
        this.rasaRoti = rasaRoti;
    }

    public int getHargaRoti() {
        return hargaRoti;
    }

    public void setHargaRoti(int hargaRoti) {
        this.hargaRoti = hargaRoti;
    }
    
    public void info(){
        System.out.println("==============================================");
        System.out.println("\t\tDETAIL PESANAN ");
        System.out.println("Pesanan : "+namaRoti+" rasa "+rasaRoti);
    }
}
