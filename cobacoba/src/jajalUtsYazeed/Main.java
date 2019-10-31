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
public class Main {
    public static void main(String[] args) {
        ObjekXY obj1 = new ObjekXY(10, Warna.HIJAU);
        JenisObjekXY obj2 = new JenisObjekXY(Warna.BIRU);
        
        double hrg = obj1.hitungDiskonY(10, 50000);
        System.out.printf("Harga Final = Rp. %,.2f\n",hrg);
        obj2.setHargaY(hrg);
        
        hrg = obj1.hitungDiskonY("sepuluh");
        hrg = hrg +10;
        System.out.printf("Super diskon %.0f",hrg);
        System.out.println("%");
        obj2.hitungDiskonY(hrg);
    }
}
