package tes;

/**
 *
 * @author ardan
 */
public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama,int gaji,int bonus) {
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
    
    @Override
    public int getGaji() {
        return gaji+bonus;
    }
    
    @Override
    public void info(){
        System.out.println("==============================");
        System.out.println("Nama Pegawai : "+nama);
        System.out.println("Bonus : "+getBonus());
        System.out.println("Gaji Awal : "+gaji);
        System.out.println("Gaji : "+getGaji());
        System.out.println("==============================");
    }
}
