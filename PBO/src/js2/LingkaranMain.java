package js2;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class LingkaranMain {
    public static void main(String[] args){
        Scanner scInt = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String jawab;
        do{
        Lingkaran bunder = new Lingkaran();
        System.out.print("Masukan Jari Jari Lingkaran : ");
        bunder.r=scInt.nextInt();
        
        System.out.println("---------------------");
        System.out.println("Output");
        System.out.println("---------------------");
        
        bunder.tampilHasil();
        System.out.println("Keliling Lingkaran : "+bunder.hitungKeliling(bunder.r));
        System.out.println("Luas Lingkaran : "+bunder.hitungLuas(bunder.r));
        System.out.print("Apakah anda ingin mengulangi? y/t : ");
        jawab = sc.nextLine();
        }
        while(jawab.equals("y")||jawab.equals("Y"));
    }
}
