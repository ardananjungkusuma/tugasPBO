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
public class Sapi extends Hewan{
    public Sapi(String nama,String bunyi,int jumlahKaki,String jenisHewan) {
        this.nama = nama;
        this.bunyi = bunyi;
        this.jumlahKaki = jumlahKaki;
        this.jenisHewan = jenisHewan;
    }
    
    
    public void makan(int waktu){
        if(waktu == 7 || waktu == 14 || waktu == 21){
            System.out.println(""+getHewanInfo());
        }
    }
    
    @Override
    public void berbunyi(){
        
    }
    
    @Override
    public String getHewanInfo(){
        return ""+this.bunyi+"\n"+this.nama+" makan nyam nyam.";
    }
}
