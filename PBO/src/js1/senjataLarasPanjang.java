package js1;

/**
 *
 * @author ardan
 */
public class senjataLarasPanjang extends senjata{
    private String scope;
    
    public void setTipeScope(String newValue){
        scope=newValue;
    }
    public void checkWeaponStatus(){
        super.checkWeaponStatus();
        System.out.println("Scoop Zooming : "+scope);
    }
}
