package kuis1;

/**
 *
 * @author ardan
 */
import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Mobil mbl = new Mobil();
        Mesin msn = new Mesin();
        mbl.setMesin(msn);
        msn.setMobil(mbl);

        System.out.print("Masukan Jenis Mobil :\n**Ferrari\n**Renault\n**Mercedes\n**Lamborghini(Ketik Nama)\n>>>");
        String jenisMobilMasuk = sc.nextLine();
        mbl.setMerk(jenisMobilMasuk);
        System.out.print("Status Mobil : \n1. Nyalakan Mobil\n2. Matikan Mobil(Angka)\n>>>");
        int nyalakanAtauMatikan = scInt.nextInt();
        if (nyalakanAtauMatikan == 1) {
            mbl.nyalakanMesin();
        } else if (nyalakanAtauMatikan == 2) {
            mbl.matikanMesin();
        } else {
            System.out.println("Masukan Perintah yang Benar.");
        }
        
        System.out.print("Anda Ingin Apa :\n1.Menambah Kecepatan\n2. Mengurangi Kecepatan:(Angka)\n>>");
        int pilihTambahAtauKurang = scInt.nextInt();
        if (pilihTambahAtauKurang == 1) {
            System.out.println("Anda Ingin Menambah Kecepatan Berapa Kali?");
            if (mbl.getMerk().equalsIgnoreCase("Ferrari")) {
                System.out.println("Kecepatan Ferrari 1x tambah 30 km/jam");
                System.out.print("Tambah Kecepatan Sebanyak >> ");
                int tambahKecepatanMobil = scInt.nextInt();
                for (int i = 0; i < tambahKecepatanMobil; i++) {
                    msn.tambahKecepatan();
                }
                mbl.info();
            } else if (mbl.getMerk().equalsIgnoreCase("Renault")) {
                System.out.println("Kecepatan Renault 1x tambah 55 km/jam");
                System.out.print("Tambah Kecepatan Sebanyak >> ");
                int tambahKecepatanMobil = scInt.nextInt();
                for (int i = 0; i < tambahKecepatanMobil; i++) {
                    msn.tambahKecepatan();
                }
                mbl.info();
            } else if (mbl.getMerk().equalsIgnoreCase("Mercedes")) {
                System.out.println("Kecepatan Mercedes 1x tambah 65 km/jam");
                System.out.print("Tambah Kecepatan Sebanyak >> ");
                int tambahKecepatanMobil = scInt.nextInt();
                for (int i = 0; i < tambahKecepatanMobil; i++) {
                    msn.tambahKecepatan();
                }
                mbl.info();
            } else if (mbl.getMerk().equalsIgnoreCase("Lamborghini")) {
                System.out.println("Kecepatan Lamborghini 1x tambah 75 km/jam");
                System.out.print("Tambah Kecepatan Sebanyak >> ");
                int tambahKecepatanMobil = scInt.nextInt();
                for (int i = 0; i < tambahKecepatanMobil; i++) {
                    msn.tambahKecepatan();
                }
                mbl.info();
            }
            System.out.print("Apakah Anda Ingin Mengurangi Kecepatan?\n*Ya\n*Tidak(Ketik Ya atau Tidak)\n>>");
            String tawaranLagi = sc.nextLine();
            if (tawaranLagi.equalsIgnoreCase("ya")) {
                System.out.println("Anda Ingin Mengurangi Kecepatan Sebanyak Berapa kali?: ");
                if (mbl.getMerk().equalsIgnoreCase("Ferrari")) {
                    System.out.println("Ferrari 1x Berkurang Kecepatan Sebanyak 10 km/jam");
                    System.out.print("Kurangi Kecepatan Sebanyak >> ");
                    int kurangKecepatanMobil = scInt.nextInt();
                    for (int i = 0; i < kurangKecepatanMobil; i++) {
                        msn.kurangiKecepatan();
                    }
                    System.out.println("\n=======FINAL CAR RESULT=========");
                    mbl.info();
                } else if (mbl.getMerk().equalsIgnoreCase("Renault")) {
                    System.out.println("Renault 1x Berkurang Kecepatan Sebanyak 20 km/jam");
                    System.out.print("Kurangi Kecepatan Sebanyak >> ");
                    int kurangKecepatanMobil = scInt.nextInt();
                    for (int i = 0; i < kurangKecepatanMobil; i++) {
                        msn.kurangiKecepatan();
                    }
                    System.out.println("\n=======FINAL CAR RESULT=========");
                    mbl.info();
                } else if (mbl.getMerk().equalsIgnoreCase("Mercedes")) {
                    System.out.println("Mercedes 1x Berkurang Kecepatan Sebanyak 35 km/jam");
                    System.out.print("Kurangi Kecepatan Sebanyak >> ");
                    int kurangiKecepatanMobil = scInt.nextInt();
                    for (int i = 0; i < kurangiKecepatanMobil; i++) {
                        msn.kurangiKecepatan();
                    }
                    System.out.println("\n=======FINAL CAR RESULT=========");
                    mbl.info();
                } else if(mbl.getMerk().equalsIgnoreCase("Lamborghini")){
                System.out.println("Lamborghini 1x Berkurang Kecepatan Sebanyak 45 km/jam");
                System.out.print("Kurangi Kecepatan Sebanyak >> ");
                int kurangiKecepatanMobil = scInt.nextInt();
                for(int i = 0;i<kurangiKecepatanMobil;i++){
                    msn.kurangiKecepatan();
                }
                System.out.println("\n=======FINAL CAR RESULT=========");
                mbl.info();
            }
            } else if (tawaranLagi.equalsIgnoreCase("tidak")) {
                System.out.println("\n=======FINAL CAR RESULT=========");
                mbl.info();
            }
        } else if (pilihTambahAtauKurang == 2) {
            msn.kurangiKecepatan();
            mbl.info();
        } else {
            System.out.println("Masukan Perintah yang Benar.");
        }

    }
}
