package js2;

/**
 *
 * @author ardan
 */
public class arGameStore {
    public int id,lamaSewa;
    public String namaMember,namaGame;
    public double harga,totalHarga;
    
    public void tampilHarga(){
        System.out.println("ID Peminjam : "+id);
        System.out.println("Nama Peminjam: "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Lama Sewa Pinjam : "+lamaSewa);
        System.out.println("Harga Sewa Perhari : "+harga);
    }
    
    double transaksiPeminjaman(int lamaSewa,double harga){
        totalHarga=lamaSewa * harga;
        return totalHarga;
    }
}
