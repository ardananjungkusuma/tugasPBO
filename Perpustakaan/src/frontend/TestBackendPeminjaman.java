/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota;
import backend.Peminjaman;
import backend.Buku;

/**
 *
 * @author ardan
 */
public class TestBackendPeminjaman {
    public static void main(String[] args) {
        Anggota ardan = new Anggota().getById(4);
        Buku TimunMas = new Buku().getById(34);
        Peminjaman peminjaman1 = new Peminjaman(ardan,TimunMas,"2019/09/21","2019/10/01");
        
        peminjaman1.save();
        
        for(Peminjaman p : new Peminjaman().getAll()){
            System.out.println("Nama Peminjam : "+p.getAnggota().getNama()+", Nama Buku : "+p.getBuku().getJudul()+", "
                    + "Tanggal Pinjam: "+p.getTanggalPinjam()+", Tanggal Kembali: "+p.getTanggalKembali());
        }
    }
}
