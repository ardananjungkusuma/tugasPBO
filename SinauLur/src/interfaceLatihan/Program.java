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
public class Program {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Budi");
        Sarjana sarjanaCumlaude = new Sarjana("Ardan");
        PascaSarjana pascaSarjanaCumlaude = new PascaSarjana("Amalia");
        
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(pascaSarjanaCumlaude);


        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(pascaSarjanaCumlaude);
        
    }
}
