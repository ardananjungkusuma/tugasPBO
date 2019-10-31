/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author ardan
 */
public class PegawaiTetap extends Pegawai {

    private String posisi;

    public PegawaiTetap() {
    }

    public String getPosisi() {
        if (posisi.equalsIgnoreCase("Direktur")) {
            super.tambahanGaji = 3000000;
        } else if (posisi.equalsIgnoreCase("Manajer")) {
            super.tambahanGaji = 2000000;
        } else if (posisi.equalsIgnoreCase("Staff")) {
            super.tambahanGaji = 1000000;
        }
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public void infoPosisi() {
        System.out.println("Posisi : " + getPosisi());
    }
}
