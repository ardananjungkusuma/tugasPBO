/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Anggota;
/**
 *
 * @author ardan
 */
public class TestBackendAnggota {
    public static void main(String[] args) {
        Anggota ang1 = new Anggota("Ardan","Banjarejo","085258967800");
        Anggota ang2 = new Anggota("Dina","Sukun","0852123141142");
        Anggota ang3 = new Anggota("Novia","Lampung","08521231242");
        
        ang1.save();
        ang2.save();
        ang3.save();
        
        ang2.setAlamat("Jatimulyo");
        ang2.save();
        
        for(Anggota a : new Anggota().getAll()){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
        
        for(Anggota a : new Anggota().search("Lampung")){
            System.out.println("Nama : "+a.getNama()+", Alamat : "+a.getAlamat()+", Telepon: "+a.getTelepon());
        }
    }
}
