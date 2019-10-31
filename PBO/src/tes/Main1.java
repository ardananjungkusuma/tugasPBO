package tes;

/**
 *
 * @author ardan
 */
public class Main1 {

    public static void main(String[] args) {
        Pegawai pM = new Manajer("Ardan", 5000000, 1000000);
        Pegawai pP = new Programmer("Kusuma", 3000000, 1500000);
        Bayaran b = new Bayaran();

        System.out.println("Bayaran Untuk Manajer: " + b.hitungBayaran(pM));
        System.out.println("Bayaran Untuk Programmer: " + b.hitungBayaran(pP));
        pM.info();
        pP.info();
    }
}
