/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author ardan
 */
public class PembeliBiasa extends Pembeli{
    private String nama;

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public double bayarSekarang(double masukkan){
        return masukkan;
    }
}
