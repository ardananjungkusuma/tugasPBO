package jsInheritance;

/**
 *
 * @author ardan
 */
public class Mac extends Leptop{
    public String security;
    
    public Mac(){
        
    }

    public Mac(String merk, int kecProcessor, int sizeMemory, String jnsProcessor, String jnsBaterai,String security) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor, jnsBaterai);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLeptop();
        System.out.println("Security : "+security);
    }
    
}
