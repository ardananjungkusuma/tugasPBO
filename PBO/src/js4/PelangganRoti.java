package js4;

/**
 *
 * @author ardan
 */
public class PelangganRoti {
    private String idPelanggan;
    private String namaPelanggan;
    private String alamat;
    
    PelangganRoti(){  
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public void infoPelanggan(){
        System.out.print("Nama Pelanggan : "+namaPelanggan);
        System.out.print("Alamat : "+alamat);
    }
}
