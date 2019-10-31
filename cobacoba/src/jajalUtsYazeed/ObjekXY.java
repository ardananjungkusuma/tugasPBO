/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajalUtsYazeed;

/**
 *
 * @author ardan
 */
public class ObjekXY {
    int presensi;
    Warna warna;
    int haha;
    
    public ObjekXY(int presensi, Warna warna) {
        this.presensi = presensi;
        this.warna = warna;
    }
    
    public double hitungDiskonY(int diskon,int harga){
        double diskonItung = diskon /100;
        double jumlahDiskon = diskonItung * harga;
        double finall = harga - jumlahDiskon;
        return finall;
    }
    
    public int hitungDiskonY(String jumlah){
        if(jumlah == "sepuluh"){
            haha = 10;
        }
        return haha;
    }
}
