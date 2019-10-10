/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author ardan
 */
public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(float r) {
        return super.luas(r);
    }

    @Override
    public float keliling(float r) {
        return super.keliling(r); 
    }
    
    public void info(){
        System.out.println("Luas Lingkaran : "+luas(r));
        System.out.println("Keliling Lingkaran : "+keliling(r));
    }
}
