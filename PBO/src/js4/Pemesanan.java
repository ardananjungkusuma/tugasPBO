package js4;

/**
 *
 * @author ardan
 */
public class Pemesanan {
    private int idPemesanan;
    private String tanggalPemesanan;
    private PelangganRoti pelanggan;
    private PegawaiRoti pegawai;
    private Roti roti;//aggregation
    private int jumlah;
    
    public Pemesanan(){
        
    }

    public PegawaiRoti getPegawai() {
        return pegawai;
    }

    public void setPegawai(PegawaiRoti pegawai) { //dependency
        this.pegawai = pegawai;
    }

    public Roti getRoti() {//aggregation
        return roti;
    }

    public void setRoti(Roti roti) {//aggregation
        this.roti = roti;
    }
    
    public Pemesanan(int idPemesanan, String tanggalPemesanan, PelangganRoti pelanggan, int jumlah) {
        this.idPemesanan = idPemesanan;
        this.tanggalPemesanan = tanggalPemesanan;
        this.pelanggan = pelanggan;
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

    public PelangganRoti getPelanggan() {//aggregation
        return pelanggan;
    }

    public void setPelanggan(PelangganRoti pelanggan) {//aggregation
        this.pelanggan = pelanggan;
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
    public void info(){
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("\t\tKWITANSI");
        pegawai.info();
        System.out.println("==============================================");
        System.out.println("\t\tRINCIAN PEMESANAN");
        System.out.println("ID Pemesanan : "+idPemesanan);
        System.out.println("Tanggal Pemesanan : "+tanggalPemesanan);
        pelanggan.info();
        roti.info();
        System.out.println("==============================================");
    }
}