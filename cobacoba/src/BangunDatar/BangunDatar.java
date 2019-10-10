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
public class BangunDatar {
    public float luas(float panjang, float lebar){
        float luas;
        luas = panjang*lebar;
        return luas;
    }
    public float keliling(float panjang,float lebar){
        float keliling;
        keliling = 2*(panjang+lebar);
        return keliling;
    }
    
    public float luas (float r){
        float luas;
        luas = 3.14f*r*r;
        return luas;
    }
    
    public float keliling(float r){
        float keliling;
        keliling = 2 * 3.14f * r;
        return keliling;
    }
}
