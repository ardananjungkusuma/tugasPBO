package js2;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class Barang1Main {
    public static void main(String[] args){
        Barang1 brg1 = new Barang1();
        String jawab;
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        do{
        System.out.print("Masukan Kode : ");
        brg1.kode = sc.nextLine();
        System.out.print("Masukan Nama Barang : ");
        brg1.namaBarang = sc.nextLine();
        System.out.print("Masukan Harga Dasar : ");
        brg1.hargaDasar = scInt.nextInt();
        System.out.print("Masukan Diskon : ");
        brg1.diskon = scInt.nextInt();
        
        System.out.println("---------------------");
        System.out.println("Output");
        System.out.println("---------------------");
        
        brg1.tampilDetail();
        System.out.println("Total Yang Harus Dibayar : "+brg1.hitungHargaJual(brg1.hargaDasar, brg1.diskon));
        System.out.print("Apakah anda ingin mengulangi? y/t : ");
        jawab = sc.nextLine();
        }
        while(jawab.equals("y")||jawab.equals("Y"));
    }
}
