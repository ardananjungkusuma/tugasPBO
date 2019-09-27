package jsInheritance;

/**
 *
 * @author ardan
 */
import java.util.Scanner;

public class MainKomputer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        Komputer kom = new Komputer();
        Pc pc = new Pc();
        Leptop lep = new Leptop();
        Mac mac = new Mac();
        Windows windows = new Windows();
        System.out.print("Pilih Tipe : \n1.Mac\n2.Windows\n3.PC\n>>");
        int tipeJenis = scInt.nextInt();
        if (tipeJenis == 1) {
            System.out.print("Masukan Merk Laptop :  ");
            mac.merk = sc.nextLine();
            System.out.print("Masukan Kecepatan Processor : ");
            mac.kecProcessor = scInt.nextInt();
            System.out.print("Masukan Size Memory : ");
            mac.sizeMemory = scInt.nextInt();
            System.out.print("Masukan jenis processor : ");
            mac.jnsProcessor = sc.nextLine();
            System.out.print("Masukan Jenis Baterai : ");
            mac.jnsBaterai = sc.nextLine();
            System.out.print("Masukan Security : ");
            mac.security = sc.nextLine();
            mac.tampilMac();
        } else if (tipeJenis == 2) {
            System.out.print("Masukan Merk Laptop :  ");
            windows.merk = sc.nextLine();
            System.out.print("Masukan Kecepatan Processor : ");
            windows.kecProcessor = scInt.nextInt();
            System.out.print("Masukan Size Memory : ");
            windows.sizeMemory = scInt.nextInt();
            System.out.print("Masukan jenis processor : ");
            windows.jnsProcessor = sc.nextLine();
            System.out.print("Masukan Jenis Baterai : ");
            windows.jnsBaterai = sc.nextLine();
            System.out.print("Masukan Fitur : ");
            windows.fitur = sc.nextLine();
            windows.tampilWindows();
        } else if (tipeJenis == 3) {
            System.out.print("Masukan Merk Laptop :  ");
            pc.merk = sc.nextLine();
            System.out.print("Masukan Kecepatan Processor : ");
            pc.kecProcessor = scInt.nextInt();
            System.out.print("Masukan Size Memory : ");
            pc.sizeMemory = scInt.nextInt();
            System.out.print("Masukan jenis processor : ");
            pc.jnsProcessor = sc.nextLine();
            System.out.print("Masukan ukuran monitor : ");
            pc.ukuranMonitor = scInt.nextInt();
            pc.tampilPc();
        } else {
            System.out.print("Pilih yang benar");
        }
    }
}
