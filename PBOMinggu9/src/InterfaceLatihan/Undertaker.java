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
public class Undertaker extends Wrestler implements IWinner{
    
    public Undertaker(String name){
        super(name);
    }
    
    @Override
    public void WWEWinner() {
        super.bertandingDiRing();
        System.out.println("The Death Man Walking always be the Winner");
    }
}
