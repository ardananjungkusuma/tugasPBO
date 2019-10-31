package js7;

/**
 *
 * @author ardan
 */
public class Mahasiswa extends Manusia{
    @Override
    public void makan(){
        System.out.println("------------------");
        super.makan();
        System.out.println("------------------");
        System.out.println("Mahasiswa Makan Mie");
    }
    
    public void tidur(){
        System.out.println("Mahasiswa Tidur Terus");
    }
}