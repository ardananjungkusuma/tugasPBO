/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

/**
 *
 * @author ardan
 */
import java.util.Scanner;

public class MainMotor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Mesin m = new Mesin();
        SepedaMotor sM = new SepedaMotor();
        MotorTrail mT = new MotorTrail();

        System.out.print("Masukan Merk Motor: ");
        String merkMotorr = sc.nextLine();
        sM.setMerkMotor(merkMotorr);
        System.out.print("Masukan Merk Mesin: ");
        String merkMesinn = sc.nextLine();
        m.setMerk(merkMesinn);
        System.out.print("Masukan Tipe Motor : \n1. Motor Biasa\n2. Motor Trail\n>>");
        int tipeMotor = scInt.nextInt();
        if (tipeMotor == 1) {
            System.out.print("Nyalakan atau matikan mesin: \n1. Nyalakan\n2. Matikan\n>>");
            int pilih = scInt.nextInt();
            if (pilih == 1) {
                sM.nyalakanKontakMotor();
                System.out.print("Pilihan : \n1. Tambahkan Kecepatan\n2. Kurangi Kecepatan\n>>");
                int kecepatan = scInt.nextInt();
                if (kecepatan == 1) {
                    m.tambahKecepatan();
                } else if (kecepatan == 2) {
                    m.kurangiKecepatan();
                } else {
                    System.out.print("Masukan Angka Yang sesuai");
                }
            } else if (pilih == 2) {
                sM.matikanKontakMotor();
                System.out.print("Maaf Mesin Mati, jadi tidak bisa tambah kecepatan");
            } else {
                System.out.print("Status tidak valid");
            }
        } else if (tipeMotor == 2) {
            System.out.print("Nyalakan atau matikan mesin: \n1. Nyalakan\n2. Matikan\n>>");
            int pilih = scInt.nextInt();
            if (pilih == 1) {
                sM.nyalakanKontakMotor();
                System.out.print("Masukan Status Kopling :\n1.None\n2.Full\n>>");
                int statusKopling = scInt.nextInt();
                if (statusKopling == 1) {
                    System.out.print("Anda tidak dapat menambah kecepatan karena posisi kopling none");
                } else if (statusKopling == 2) {
                    mT.setKondisiKopling("Full");
                    System.out.print("Pilihan : \n1. Tambahkan Kecepatan\n2. Kurangi Kecepatan\n>>");
                    int kecepatan = scInt.nextInt();
                    if (kecepatan == 1) {
                        m.tambahKecepatan();
                        mT.setKondisiKopling("Half");
                        System.out.println("Kondisi Kopling : "+mT.getKondisiKopling());
                        mT.setKondisiKopling("None");
                        System.out.println("Kondisi Kopling : "+mT.getKondisiKopling());
                    } else if (kecepatan == 2) {
                        m.kurangiKecepatan();
                    } else {
                        System.out.print("Masukan Angka Yang sesuai");
                    }

                }

            } else if (pilih == 2) {
                sM.matikanKontakMotor();
                System.out.print("Maaf Mesin Mati, jadi tidak bisa tambah kecepatan");
            } else {
                System.out.print("Status tidak valid");
            }

        }

        sM.setMesin(m);
        sM.info();

    }
}
