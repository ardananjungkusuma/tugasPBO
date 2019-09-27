package jsInheritance;

/**
 *
 * @author ardan
 */
public class Pc extends Komputer{
    public int ukuranMonitor;
    
    public Pc(){
        
    }

    public Pc(String merk, int kecProcessor, int sizeMemory, String jnsProcessor,int ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jnsProcessor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        super.tampilData();
        System.out.println("Ukuran Monitor : "+ukuranMonitor);
    }

    
    
}
