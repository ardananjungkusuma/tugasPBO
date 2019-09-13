package js2;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class arGameStoreMain {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    String jawab;
    do{
        arGameStore ags = new arGameStore();
        System.out.print("Isi ID Game : ");
        ags.id = scInt.nextInt();
        System.out.print("Nama Member : ");
        ags.namaMember = sc.nextLine();
        System.out.print("Nama Game : ");
        ags.namaGame = sc.nextLine();
        System.out.print("Lama Sewa (Hari) : ");
        ags.lamaSewa = scInt.nextInt();
        System.out.print("Harga Sewa Per Hari : ");
        ags.harga = scInt.nextInt();
        System.out.println("---------------------");
        System.out.println("Output");
        System.out.println("---------------------");
        ags.tampilHarga();
        System.out.println("Total Harga adalah : "+ags.transaksiPeminjaman(ags.lamaSewa,ags.harga));
        System.out.print("Apakah anda ingin mengulangi? y/t : ");
        jawab = sc.nextLine();
        }
        while(jawab.equals("y")||jawab.equals("Y"));
    }
}
