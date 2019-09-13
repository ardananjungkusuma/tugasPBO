package js2;

/**
 *
 * @author ardan
 */
public class Barang1 {
    String kode,namaBarang;
    int hargaDasar;
    float diskon,hargaJual;
    
    void tampilDetail(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp. "+hargaDasar);
        System.out.println("Diskon : "+diskon);
    }
    
    float hitungHargaJual(int hargaDasar,float diskon){
        hargaJual = hargaDasar - ((diskon * hargaDasar)/100);
        return hargaJual;
    }
}
