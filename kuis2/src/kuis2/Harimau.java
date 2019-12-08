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
public class Harimau extends Hewan {
    public Harimau(String nama,String bunyi,int jumlahKaki,String jenisHewan) {
        this.nama = nama;
        this.bunyi = bunyi;
        this.jumlahKaki = jumlahKaki;
        this.jenisHewan = jenisHewan;
    }
    
    
    public void makan(int waktu){
        if(waktu == 6||waktu == 12 || waktu == 18){
            System.out.println(""+getHewanInfo());
        }
    }
    
    @Override
    public void berbunyi(){
        
    }
    
    @Override
    public String getHewanInfo(){
        return ""+this.bunyi+"\n"+this.nama+" makan nyam nyam.\n"+this.nama+" Betina makan bareng jantan";
    }
}
