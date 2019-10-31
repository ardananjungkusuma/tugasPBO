package tes;

/**
 *
 * @author ardan
 */
public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String nama,int gaji,int tunjangan) {
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }
    
    @Override
    public int getGaji() {
        return gaji+tunjangan;
    }
    
    @Override
    public void info(){
        System.out.println("==============================");
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Gaji : "+gaji);
        System.out.println("Tunjangan : "+getTunjangan());
        System.out.println("Gaji Total : "+getGaji());
        System.out.println("==============================");
    }
}
