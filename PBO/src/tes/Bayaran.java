package tes;

/**
 *
 * @author ardan
 */
public class Bayaran {

    public int hitungBayaran(Pegawai x) {
        if (x instanceof Manajer) {
            return ((Manajer) x).getGaji();
        } else if(x instanceof Programmer) {
            return ((Programmer) x).getGaji();
        } else{
            return 0;
        }
    }
}
