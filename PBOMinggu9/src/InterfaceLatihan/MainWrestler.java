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
public class MainWrestler {
    public static void main(String[] args) {
        Undertaker undertaker = new Undertaker("Undertaker");
        Bautista bautista = new Bautista("Bautista");
        Referee mcMahon = new Referee();
        
        undertaker.name = "Undetaker";
        undertaker.salaryWrestler(12);
        mcMahon.giveTheWinnerBelt(undertaker);
        
        
        bautista.name = "Bautista";
        bautista.salaryWrestler(10);
        bautista.bertandingDiRing();
//        mcMahon.giveTheWinnerBelt(bautista);
        
        
        
    }
}
