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
public class Referee {
    public void giveTheWinnerBelt(IWinner wrestlerPlayer){
        System.out.println("The Winner is.....");
        wrestlerPlayer.WWEWinner();
        System.out.println("-------------------");
    }
}
