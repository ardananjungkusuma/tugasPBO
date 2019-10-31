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
public class Pegawai {
    public int noPeg;
    public String nama;
    public String alamat;
    public String tahunMasuk;
    public int gaji;
    public int tambahanGaji;
    public Benefit benefit;
    public PegawaiTetap pegawaiTetap;

    public PegawaiTetap getPegawaiTetap() {
        return pegawaiTetap;
    }

    public void setPegawaiTetap(PegawaiTetap pegawaiTetap) {
        this.pegawaiTetap = pegawaiTetap;
    }
    
    public Pegawai() {
    }

    public Pegawai(int noPeg, String nama, String alamat, String tahunMasuk, int gaji, Benefit benefit) {
        this.noPeg = noPeg;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gaji = gaji;
        this.benefit = benefit;
    }

    public int getNoPeg() {
        return noPeg;
    }

    public void setNoPeg(int noPeg) {
        this.noPeg = noPeg;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public String getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(String tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public int getTotalGaji(){
        
        return this.gaji+benefit.getTunjanganKel()+tambahanGaji;
    }
    
    public void info(){
        System.out.println("No Pegawai : "+this.noPeg);
        System.out.println("Nama Pegawai : "+this.nama);
        pegawaiTetap.infoPosisi();
        System.out.println("Alamat Pegawai : "+this.alamat);
        System.out.println("Tahun Masuk : "+this.tahunMasuk);
        System.out.println("Gaji : "+this.gaji);
        benefit.tampilkanBenefit();
        System.out.println("Total Gaji : "+this.getTotalGaji());
        
    }
    
}
