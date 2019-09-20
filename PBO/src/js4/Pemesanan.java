package js4;

/**
 *
 * @author ardan
 */
public class Pemesanan {
    private int idPemesanan;
    private String tanggalPemesanan;
    private PelangganRoti pelanggan;
    private Roti roti;
    private PegawaiRoti pegawai;
    private int jumlah;

    public Pemesanan(){
        
    }
    
    public Pemesanan(int idPemesanan, String tanggalPemesanan, PelangganRoti pelanggan, Roti roti, PegawaiRoti pegawai, int jumlah) {
        this.idPemesanan = idPemesanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.pelanggan = pelanggan;
        this.roti = roti;
        this.pegawai = pegawai;
        this.jumlah = jumlah;
    }

    
    
    public int getIdPemesanan() {
        return idPemesanan;
    }

    public void setIdPemesanan(int idPemesanan) {
        this.idPemesanan = idPemesanan;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public PelangganRoti getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(PelangganRoti pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Roti getRoti() {
        return roti;
    }

    public void setRoti(Roti roti) {
        this.roti = roti;
    }

    public PegawaiRoti getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiRoti pegawai) {
        this.pegawai = pegawai;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int hitungTotal(int hargaRoti,int jumlahPesanan){
        int hasil = hargaRoti * jumlahPesanan;
        return hasil;
    }
    
}
