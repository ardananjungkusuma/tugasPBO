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
public class FoodTruck {
    private String jamBuka;
    private String jamTutup;
    private String namaRestoran;
    Makanan makanan;
    Minuman minuman;

    public FoodTruck() {
    }

    public String getJamBuka() {
        return jamBuka;
    }

    public void setJamBuka(String jamBuka) {
        this.jamBuka = jamBuka;
    }

    public String getJamTutup() {
        return jamTutup;
    }

    public void setJamTutup(String jamTutup) {
        this.jamTutup = jamTutup;
    }

    public String getNamaRestoran() {
        return namaRestoran;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public Makanan getMakanan() {
        return makanan;
    }

    public void setMakanan(Makanan makanan) {
        this.makanan = makanan;
    }

    public Minuman getMinuman() {
        return minuman;
    }

    public void setMinuman(Minuman minuman) {
        this.minuman = minuman;
    }
}
