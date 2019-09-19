package js4;

/**
 *
 * @author ardan
 */
public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setNamaMobil("Avanza");
        m.setBiayaMobil(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Marry Jane");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Biaya total : "+p.hitungBiayaTotal());
        System.out.println(p.getMobil().getNamaMobil());
    }
}
