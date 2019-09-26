/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobacoba;

/**
 *
 * @author ardan
 */
public class SepedaMotor{
    private String merkMotor;
    private boolean kontakMotor;
    private Mesin mesin;
    
    public SepedaMotor(){
        
    }
    
    public SepedaMotor(String merkMotor, boolean kontakMotor) {
        this.merkMotor = merkMotor;
        this.kontakMotor = kontakMotor;
    }

    public String getMerkMotor() {
        return merkMotor;
    }

    public void nyalakanKontakMotor(){
        this.kontakMotor = true;
    }
    
    public void matikanKontakMotor(){
        this.kontakMotor = false;
    }

    public boolean isKontakMotor() {
        return kontakMotor;
    }

    public void setMerkMotor(String merkMotor) {
        this.merkMotor = merkMotor;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void info(){
        System.out.println("Status Merk Motor: "+getMerkMotor());
        System.out.println("Status Merk Mesin: "+mesin.getMerk());
        System.out.println("Status Mesin : "+mesin.getMerk());
        System.out.println("Status Kecepatan : "+mesin.getKecepatan()+" km");
    }
}
