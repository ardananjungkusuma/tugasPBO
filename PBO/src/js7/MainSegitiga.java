package js7;

/**
 *
 * @author ardan
 */
import java.util.Scanner;

public class MainSegitiga {

    public static void main(String[] args) {
        Segitiga sg = new Segitiga();
        Scanner scInt = new Scanner(System.in);
        System.out.println("Menu Segitiga");
        System.out.println("1. Penghitungan Sudut");
        System.out.println("2. Penghitungan Keliling Segitiga: ");
        System.out.print("3. Penghitungan Pythagoras: \n>> ");
        int menu = scInt.nextInt();
        if (menu == 1) {
            System.out.print("Masukan Sudut Luar A : ");
            int suduta = scInt.nextInt();
            System.out.print("Masukan Sudut Luar B : ");
            int sudutb = scInt.nextInt();
            System.out.println("Sudut A : " + sg.totalSudut(suduta));
            System.out.println("Sudut A dan Sudut B : " + sg.totalSudut(suduta, sudutb));
        } else if (menu == 2) {
            System.out.print("Masukan Sisi A: ");
            int sisia = scInt.nextInt();
            System.out.print("Masukan Sisi B: ");
            int sisib = scInt.nextInt();
            System.out.print("Masukan Sisi C: ");
            int sisic = scInt.nextInt();
            System.out.println("Keliling Segitiga : " + sg.keliling(sisia, sisib, sisic));
        } else if (menu == 3) {
            System.out.print("Masukan Sisi A: ");
            int sisia = scInt.nextInt();
            System.out.print("Masukan Sisi B: ");
            int sisib = scInt.nextInt();
            System.out.println("Pythagoras : " + sg.pythagoras(sisia, sisib));
        } else {
            System.out.println("Masukan Menu yang benar!");
        }

    }
}
