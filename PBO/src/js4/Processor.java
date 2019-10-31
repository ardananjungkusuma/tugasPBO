package js4;

/**
 *
 * @author ardan
 */
public class Processor {
    private String merkProc;
    private double cache;

    public Processor(){
        
    }
    
    public Processor(String merk, double cache) {
        this.merkProc = merk;
        this.cache = cache;
    }

    public String getMerkProc() {
        return merkProc;
    }

    public void setMerkProc(String merkProc) {
        this.merkProc = merkProc;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
    
    public void info(){
        System.out.println("Merk Processor : "+merkProc);
        System.out.println("Cache memory : "+cache);
    }
}
