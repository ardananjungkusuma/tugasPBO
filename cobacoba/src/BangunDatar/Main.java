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
public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        pp.panjang = 15;
        pp.lebar = 5;
        l.r = 7;
        pp.info();
        l.info();
    }
}
