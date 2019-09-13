package js3;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class EncapTest {
    public static void main(String[] args) {
        int umur;
        String nama,jawab;
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        do{
        EncapDemo encap = new EncapDemo();
        System.out.print("Enter your Name : ");
        nama = sc.nextLine();
        encap.setNama(nama);
        System.out.print("Enter your Age : ");
        umur = scInt.nextInt();
        encap.setAge(umur);
        System.out.println("----------------------");
        System.out.println("Name : "+encap.getNama());
        System.out.println("Age : "+encap.getAge());
        System.out.print("Apakah anda ingin mengulangi lagi? y/t");
        jawab = sc.nextLine();
        }while(jawab.equals("y")||jawab.equals("Y"));
    }
}