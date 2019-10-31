/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinauUTS2;

/**
 *
 * @author ardan
 */
public class SepedaMotor {
    protected String merk;
    protected int kecepatan;

    public SepedaMotor(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public SepedaMotor() {
    }
    
    public void SetMerk(String merk){
        this.merk = merk;
    }
    
    public void tambahKecepatan(){
        
    }
    
    
    
    
}
