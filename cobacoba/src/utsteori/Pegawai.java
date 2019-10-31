/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsteori;

/**
 *
 * @author ardan
 */
public class Pegawai {
    protected int NIP;
    protected String nama;
    protected int sks;
    protected float gaji;
    protected int jamKerja;

    public Pegawai() {
    }    

    public Pegawai(int NIP, String nama, int sks, float gaji) {
        this.NIP = NIP;
        this.nama = nama;
        this.sks = sks;
        this.gaji = gaji;
    }

    public Pegawai(int NIP, String nama, int jamKerja, float gaji) {
        this.NIP = NIP;
        this.nama = nama;
        this.jamKerja = jamKerja;
        this.gaji = gaji;
    }
    
    public void cetakStatus(){
        System.out.println("Nama: ");
        System.out.println("NIP");
    }
}
