package js3;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class TestKoperasi
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        String noKtp,anggotaNama;
        String jawab;
        int pilihan;
        float jumlahPinjaman,jumlahAngsuran,jumlahLimit;
        do{
           System.out.println("--------------");
        System.out.println("1. Pinjam ");
        System.out.println("2. Angsur");
        System.out.print("Masukan Pilihan : ");
        pilihan=scInt.nextInt();
        switch(pilihan){
            case 1 :
                do{
                    System.out.println("-------MENU PINJAMAN-------");
                    System.out.print("Masukan Nomor KTP : ");
                    noKtp = sc.nextLine();
                    System.out.print("Masukan Nama Anggota : ");
                    anggotaNama=sc.nextLine();
                    System.out.print("Masukan Limit Pinjam : ");
                    jumlahLimit = scInt.nextFloat();
                    System.out.print("Masukan Jumlah Pinjaman : ");
                    jumlahPinjaman = scInt.nextFloat();
                    AnggotaKoperasi anggotaCoy = new AnggotaKoperasi(noKtp,anggotaNama,jumlahLimit);
                    anggotaCoy.setPinjam(jumlahPinjaman);
                    System.out.println("Jumlah pinjaman saat ini: " + anggotaCoy.getPinjam());
                    System.out.print("Apakah Anda ingin meminjam lagi? y/t : ");
                    jawab = sc.nextLine();
                }while(jawab.equals("y")||jawab.equals("Y"));
                
                break;
            case 2 :
                do{
                    System.out.println("-------MENU ANGSURAN-------");
                    System.out.print("Masukan Nomor KTP : ");
                    noKtp = sc.nextLine();
                    System.out.print("Masukan Nama Anggota : ");
                    anggotaNama=sc.nextLine();
                    System.out.print("Masukan Limit Pinjam : ");
                    jumlahLimit = scInt.nextFloat();
                    System.out.print("Masukan Jumlah Pinjaman : ");
                    jumlahPinjaman = scInt.nextFloat();
                    AnggotaKoperasi anggotaCoyAngsur = new AnggotaKoperasi(noKtp,anggotaNama,jumlahLimit);
                    anggotaCoyAngsur.setPinjam(jumlahPinjaman);
                    System.out.print("Masukan Jumlah Angsuran : ");
                    jumlahAngsuran = scInt.nextFloat();
                    anggotaCoyAngsur.setAngsur(jumlahAngsuran);
                    System.out.println("Jumlah pinjaman saat ini: " + anggotaCoyAngsur.getPinjam());
                    System.out.print("Apakah anda ingin mengangsur lagi? y/t :  ");
                    jawab = sc.nextLine();
                    }while(jawab.equals("y")||jawab.equals("Y"));
                
                break;
        } 
            System.out.print("Apakah Anda ingin mengulangi lagi? y/t:");
        jawab = sc.nextLine();
        }while(jawab.equals("y")||jawab.equals("Y"));
    }
}
