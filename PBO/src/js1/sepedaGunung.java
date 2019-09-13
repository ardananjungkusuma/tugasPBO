package js1;

/**
 *
 * @author ardan
 */
public class sepedaGunung extends sepeda{
    private String tipeSuspensi;
    
    public void setTipeSuspensi(String newValue){
        tipeSuspensi=newValue;
    }
    public void checkStatus(){
        super.checkStatus();
        System.out.println("Tipe Suspensi : "+tipeSuspensi);
    }
}
