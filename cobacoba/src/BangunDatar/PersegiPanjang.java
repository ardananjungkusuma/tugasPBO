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
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;

    @Override
    public float luas(float panjang, float lebar) {
        return super.luas(panjang, lebar); 
    }

    @Override
    public float keliling(float panjang, float lebar) {
        return super.keliling(panjang, lebar); 
    }

    public void info(){
        System.out.println("Luas Persegi Panjang : "+luas(panjang,lebar));
        System.out.println("Keliling Persegi Panjang : "+keliling(panjang,lebar));
    }
}
