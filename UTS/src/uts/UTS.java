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
public class UTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        Benefit b = new Benefit();
        PegawaiTetap pT = new PegawaiTetap();
        pT.setPegawaiTetap(pT);
        pT.setBenefit(b);
        pT.setNama("Ardan");
        pT.setAlamat("Bojonegoro");
        pT.setNoPeg(29);
        pT.setPosisi("Manajer");
        pT.setTahunMasuk("2009");
        pT.setGaji(3000000);
        pT.setBenefit(b);
        b.setCuti(5);
        b.setJaminanKes("Jamsostek");
        b.setTunjanganKel(1000000);
        pT.info();
    }
    
}
