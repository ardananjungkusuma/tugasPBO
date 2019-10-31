package js7;

/**
 *
 * @author ardan
 */
public class MainDispatch {
    public static void main(String[] args) {
        Manusia mn = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        Manusia d = new Dosen();
        Manusia m = new Mahasiswa();
        System.out.println("=======Overiding dan Extends=======");
        mhs.makan();
        dsn.makan();
        dsn.lembur();
        mhs.tidur();
        System.out.println("=======Dynamic Mode Dispatch=======");
        d.makan();
        m.makan();
        
    }
}