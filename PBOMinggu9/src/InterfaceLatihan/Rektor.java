/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLatihan;

/**
 *
 * @author ardan
 */
public class Rektor{
    
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya rektor, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");
        
        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("-----------------------------------------------");
    }
    
    public void beriSertifikatMawapres(IBerprestasi mah){
        System.out.println("Saya rektor, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");
        
        
        mah.menjuaraiKompetisi();
        mah.membuatPublikasiIlmiah();
        System.out.println("-----------------------------------------------");
    }
}
