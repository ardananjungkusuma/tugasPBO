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
public class Program {

    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Ardan");
        PascaSarjana masterCumlaude = new PascaSarjana("Amalia");
//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
        
        
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);

//        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
//        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}