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
        Kucing kucingDomestik = new Kucing();
        Ikan ikanEmas = new Ikan();
        
        Orang ardan = new Orang("Ardan");
        Orang rasyid = new Orang("Rasyid");
        
        ardan.peliharaanHewan(kucingDomestik);
        ardan.ajakHewanPeliharaanJalanJalan();
        
        rasyid.peliharaanHewan(ikanEmas);
        rasyid.ajakHewanPeliharaanJalanJalan();
    }
    
}
