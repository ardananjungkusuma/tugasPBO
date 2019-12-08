/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieLur;

/**
 *
 * @author ardan
 */
public class Barrier implements IDestroyable{
    private int strength;
    
    @Override
    public void destroyed() {
        this.strength -= this.strength * 0.1;
    }
    
    
    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public String getBarrierInfo(){
        return "Barrier Strength "+getStrength();
    }

    @Override
    public void heal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
