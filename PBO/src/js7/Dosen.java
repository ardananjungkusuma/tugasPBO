package js7;

/**
 *
 * @author ardan
 */
public class Dosen extends Manusia {
    @Override
    public void makan(){
        System.out.println("------------------");
        super.makan();
        System.out.println("------------------");
        System.out.println("Dosen Makan Ayam");
    }
    
    public void lembur(){
        System.out.println("Dosen Lembur ea");
    }
}