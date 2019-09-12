package js3;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class EncapTest {
    static String nama;
    static int umur;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        EncapDemo encap = new EncapDemo();
        System.out.print("Enter your Name : ");
        nama = sc.nextLine();
        encap.setNama(nama);
        System.out.print("Enter your Age : ");
        umur = scInt.nextInt();
        encap.setAge(umur);
        System.out.println("Name : "+encap.getNama());
        System.out.println("Age : "+encap.getAge());
    }
}