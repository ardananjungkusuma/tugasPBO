package js4;

/**
 *
 * @author ardan
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    public Laptop(){
        
    }

    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public Processor getProc() {
        return proc;
    }

    public void setProc(Processor proc) {
        this.proc = proc;
    }
    

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void info(){
        System.out.println("Merk Laptop : "+merk);
        proc.info();
    }
}
