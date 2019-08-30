package js1;

/**
 *
 * @author ardan
 */
public class sepeda {
    private String merk,warna;
    private int kecepatan;
    private int gear;
    
    public void setMerk(String newValue){
        merk = newValue;
    }
    
    public void gantiGear(int newValue){
        gear = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public void tambahKecepatan(int increment){
        kecepatan += increment;
    }
    
    public void rem(int decrement){
        kecepatan -= decrement;
    }
    
    public void checkStatus(){
        System.out.println("Merk : "+merk);
        System.out.println("Warna : "+warna);
        System.out.println("Kecepatan : "+kecepatan);
        System.out.println("Gear : "+gear);
    }
}
