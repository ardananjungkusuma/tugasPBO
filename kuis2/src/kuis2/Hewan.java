/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ardan
 */
public abstract class Hewan implements IMakan{
    protected String nama;
    protected String bunyi;
    protected int jumlahKaki;
    protected String jenisHewan;

    public void makan(){
        
    }
    
    public void berbunyi(){
        
    }
    
    public String getHewanInfo(){
        return ""+this.bunyi+"\n"+this.nama+" makan nyam nyam.";
    }
}
