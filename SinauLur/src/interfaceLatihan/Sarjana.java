/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceLatihan;

/**
 *
 * @author ardan
 */
public class Sarjana extends Mahasiswa implements ICumlaude,IBerprestasi{
    
    public Sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        super.kuliahDiKampus();
        System.out.println("Aku sudah menyelsaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK Ku lebih dari 3.51");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel ini di jurnal NASIONAL");
    }
    
    
}
