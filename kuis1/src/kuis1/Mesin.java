package kuis1;

/**
 *
 * @author ardan
 */
public class Mesin {

    private int kecepatan;
    private Mobil mobil;

    public Mesin() {

    }

    public int getKecepatan() {
        return kecepatan;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public void tambahKecepatan() {
        if (mobil.getStatusMobil() == true) {
            if (mobil.getMerk().equalsIgnoreCase("Ferrari")) {
                kecepatan += 30;
                if (kecepatan > 430) {
                    System.out.println("Anda Melebihi Kecepatan Maksimal Ferrari");
                    kecepatan = 430;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Renault")) {
                kecepatan += 55;
                if (kecepatan > 385) {
                    System.out.println("Anda Melebihi Kecepatan Maksimal Renault");
                    kecepatan = 385;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Mercedes")) {
                kecepatan += 65;
                if (kecepatan > 430) {
                    System.out.println("Anda Melebihi Kecepatan Mercedes");
                    kecepatan = 430;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Lamborghini")) {
                kecepatan += 75;
                if (kecepatan > 500) {
                    System.out.println("Anda Melebihi Kecepatan Lamborghini");
                    kecepatan = 500;
                }
            }
        } else {
            System.out.println("Mobil Dalam Kondisi Mati, nyalakan Mesin Terlebih Dahulu!");
        }
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public void kurangiKecepatan() {
        if (mobil.getStatusMobil() == true) {
            if (mobil.getMerk().equalsIgnoreCase("Ferrari")) {
                kecepatan -= 10;
                if (kecepatan < 1) {
                    System.out.println("Anda Sampai Pada Kecepatan Minimal");
                    kecepatan = 0;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Renault")) {
                kecepatan -= 20;
                if (kecepatan < 1) {
                    System.out.println("Anda Sampai Pada Kecepatan Minimal");
                    kecepatan = 0;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Mercedes")) {
                kecepatan -= 35;
                if (kecepatan < 1) {
                    System.out.println("Anda Sampai Pada Kecepatan Minimal");
                    kecepatan = 0;
                }
            } else if (mobil.getMerk().equalsIgnoreCase("Lamborghini")) {
                kecepatan -= 45;
                if (kecepatan < 1) {
                    System.out.println("Anda Sampai Pada Kecepatan Minimal");
                    kecepatan = 0;
                }
            }
        } else {
            System.out.println("Mobil Dalam Kondisi Mati, nyalakan Mesin Terlebih Dahulu!");
        }
    }

}
