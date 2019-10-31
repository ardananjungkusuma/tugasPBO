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
public class JenisObjekXY {
    Warna warnaa;
    double Harga;

    public JenisObjekXY(Warna warnaa) {
        this.warnaa = warnaa;
    }
    
    public void setHargaY(double rego){
        this.Harga = rego;
        System.out.println("Hore saya dapat diskon sepuluh persen");
    }
    
    public void hitungDiskonY(double rego){
        double itung = rego / 100;
        double total = Harga-(Harga - itung);
        System.out.println("Jadi harga jenis objectYX = Rp. "+total);
    }
}
