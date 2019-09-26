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
public class Mesin {
    private String merk;
    private double kecepatan;
    
    public Mesin(){
        
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(){
        kecepatan = kecepatan +10;
    }
    
    public void kurangiKecepatan(){
        kecepatan = kecepatan -10;
    }
    
}
