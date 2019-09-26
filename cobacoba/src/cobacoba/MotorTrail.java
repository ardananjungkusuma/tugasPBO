/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

/**
 *
 * @author ardan
 */
public class MotorTrail extends SepedaMotor{
    private String kondisiKopling;

    public MotorTrail(){
        
    }
    
    public MotorTrail(String kondisiKopling) {
        this.kondisiKopling = kondisiKopling;
    }

    public String getKondisiKopling() {
        return kondisiKopling;
    }

    public void setKondisiKopling(String kondisiKopling) {
        this.kondisiKopling = kondisiKopling;
    }
    
}
