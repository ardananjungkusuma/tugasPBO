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
public class Gajah extends Hewan{

    public Gajah(String nama,String bunyi,int jumlahKaki,String jenisHewan) {
        this.nama = nama;
        this.bunyi = bunyi;
        this.jumlahKaki = jumlahKaki;
        this.jenisHewan = jenisHewan;
    }
    
    
    public void makan(int waktu){
        //gajah 5 jam
        if(waktu == 5 || waktu == 10 || waktu == 15 || waktu == 20){
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
