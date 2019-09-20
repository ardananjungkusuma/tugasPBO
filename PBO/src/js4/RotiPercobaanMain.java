package js4;
/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class RotiPercobaanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        PegawaiRoti pg = new PegawaiRoti();
        Pemesanan pem = new Pemesanan();
        PelangganRoti pr = new PelangganRoti();
        Roti rotiDan = new Roti();
        
        System.out.println("==============================================");
        System.out.println("\tProgram Kasir Ardan Dessert Store");
        System.out.println("==============================================");
        System.out.print("Id Kasir : ");
        String idKasir = sc.nextLine();
        pg.setIdPegawai(idKasir);
        System.out.print("Nama Kasir : ");
        String namaKasir = sc.nextLine();
        pg.setNamaPegawai(namaKasir);
        System.out.println("==============================================");
        System.out.print("Masukan ID Pemesanan: ");
        int idPemesanan = scInt.nextInt();
        pem.setIdPemesanan(idPemesanan);
        System.out.print("Masukan Tanggal Pemesanan: ");
        String tanggalPesan = sc.nextLine();
        pem.setTanggalPemesanan(tanggalPesan);
        System.out.println("==============================================");
        System.out.print("ID Pemesan: ");
        String idPemesan = sc.nextLine();
        pr.setIdPelanggan(idPemesan);
        System.out.print("Nama Pemesan: ");
        String namaPemesan = sc.nextLine();
        pr.setNamaPelanggan(namaPemesan);
        System.out.print("Alamat Pemesan: ");
        String alamatPemesan = sc.nextLine();
        pr.setAlamat(alamatPemesan);
        System.out.println("==============================================");
        System.out.print("Masukan ID Roti : ");
        String idRoti = sc.nextLine();
        rotiDan.setIdRoti(idRoti);
        System.out.print("Nama Roti: ");
        String namaRoti = sc.nextLine();
        rotiDan.setNamaRoti(namaRoti);
        System.out.print("Rasa Roti: ");
        String rasaRoti = sc.nextLine();
        rotiDan.setRasaRoti(rasaRoti);
        System.out.print("Harga Roti(satuan): ");
        int hargaRoti = scInt.nextInt();
        rotiDan.setHargaRoti(hargaRoti);
        System.out.print("Jumlah Roti yang Dipesan : ");
        int jumlahRotiDipesan = scInt.nextInt();
        pem.setJumlah(jumlahRotiDipesan);
        pem.setRoti(rotiDan);
        pem.setPegawai(pg);
        pem.setPelanggan(pr);
        pem.info();
        System.out.println("Total yang harus dibayar : "+pem.hitungTotal(hargaRoti, jumlahRotiDipesan));
        System.out.println("~~~Terimakasih "+pr.getNamaPelanggan()+" Selamat Berbelanja Kembali~~~ ");
    }
}