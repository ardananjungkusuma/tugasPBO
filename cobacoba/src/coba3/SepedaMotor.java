/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba3;

/**
 *
 * @author ardan
 */
public class SepedaMotor {
    private boolean statusMotor=false;
    private String merk;
    private Mesin mesin;

    public SepedaMotor(){
    
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public boolean getStatusMotor() {
        return statusMotor;
    }
    
    public void nyalakanMotor(){
        statusMotor=true;
    }
    
    public void matikanMotor(){
        statusMotor=false;
    }
    
    public void info(){
        System.out.println("Merk Motor : "+getMerk());
        if(statusMotor == true){
            System.out.println("Status Motor : Nyala");
        }else{
            System.out.println("Status Motor : Mati");
        }
        System.out.println("Kecepatan : "+mesin.getKecepatan());
        System.out.println("=====================");
    }
    
}
