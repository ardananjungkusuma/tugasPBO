/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author ardan
 */
public class Program {
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();
        
        Orang ardan = new Orang("Ardan");
        Orang kusuma = new Orang("Budi");
        
        ardan.peliharaHewan(kucingKampung);
        kusuma.peliharaHewan(lumbaLumba);
        
        ardan.ajakPeliharaanJalanJalan();
        kusuma.ajakPeliharaanJalanJalan();
    }
}