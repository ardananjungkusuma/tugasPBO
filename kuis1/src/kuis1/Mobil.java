package kuis1;

/**
 *
 * @author ardan
 */
public class Mobil {
    private String merk;
    private boolean statusMobil=false;
    private Mesin mesin;

    public Mobil() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean getStatusMobil() {
        return statusMobil;
    }

    public void nyalakanMesin(){
        statusMobil = true;
    }
    
    public void matikanMesin(){
        statusMobil = false;
    }

    public Mesin getMesin() {
        return mesin;
    }

    public void setMesin(Mesin mesin) {
        this.mesin = mesin;
    }
    
    public void info(){
        System.out.println("Merk Mobil : "+getMerk());
        if(getStatusMobil()==true){
            System.out.println("Status Mobil : Hidup");
        }else{
            System.out.println("Status Mobil : Mati");
        }
        System.out.println("Kecepatan : "+mesin.getKecepatan());
        System.out.println("===================================");
    }
}
