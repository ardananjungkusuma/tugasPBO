package jsInheritance;

/**
 *
 * @author ardan
 */
public class Komputer {
    public String merk;
    public int kecProcessor;
    public int sizeMemory;
    public String jnsProcessor;
    
    public Komputer(){
        
    }

    public Komputer(String merk, int kecProcessor, int sizeMemory, String jnsProcessor) {
        this.merk = merk;
        this.kecProcessor = kecProcessor;
        this.sizeMemory = sizeMemory;
        this.jnsProcessor = jnsProcessor;
    }
    
    public void tampilData(){
        System.out.println("============DATA Komputer==============");
        System.out.println("Merk : "+merk);
        System.out.println("Kecepatan Processor : "+kecProcessor);
        System.out.println("Size Memory : "+sizeMemory);
        System.out.println("Jenis Processor : "+jnsProcessor);
    }
}
