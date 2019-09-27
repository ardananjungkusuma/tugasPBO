package jsInheritance;

/**
 *
 * @author ardan
 */
public class Leptop extends Komputer{
    public String jnsBaterai;
    public Leptop(){
        
    }

    public Leptop(String merk, int kecProcessor, int sizeMemory, String jnsProcessor,String jnsBaterai) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Baterai : "+jnsBaterai);
    }
    
}
