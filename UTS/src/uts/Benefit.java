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
public class Benefit {
    private String jaminanKes;
    private int tunjanganKel;
    private int cuti;
    
    public Benefit() {
    }

    public Benefit(String jaminanKes, int tunjanganKel, int cuti) {
        this.jaminanKes = jaminanKes;
        this.tunjanganKel = tunjanganKel;
        this.cuti = cuti;
    }

    public String getJaminanKes() {
        return jaminanKes;
    }

    public void setJaminanKes(String jaminanKes) {
        this.jaminanKes = jaminanKes;
    }

    public int getTunjanganKel() {
        return tunjanganKel;
    }

    public void setTunjanganKel(int tunjanganKel) {
        this.tunjanganKel = tunjanganKel;
    }

    public int getCuti() {
        return cuti;
    }

    public void setCuti(int cuti) {
        this.cuti = cuti;
    }
    
    public void tampilkanBenefit(){
        System.out.println("Jaminan Kesehatan : "+this.getJaminanKes());
        System.out.println("Tunjangan Keluarga : "+this.getTunjanganKel());
        System.out.println("Cuti : "+this.getCuti()+" hari");
    }
}
