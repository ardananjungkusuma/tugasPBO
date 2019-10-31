package js7;

/**
 *
 * @author ardan
 */
import java.lang.Math;
public class Segitiga {
    private int sudut;
    private double keliling;

    public double getKeliling() {
        return keliling;
    }

    public int totalSudut(int sudutA){
        return 180-sudutA;
    }
    
    //overloading totalsudutatas
    public int totalSudut(int sudutA, int sudutB){
        return 180 -(sudutA + sudutB);
    }
    
    public double keliling(int sisiA,int sisiB,int sisiC){
        return keliling = sisiA+sisiB+sisiC;
    }
    
    public double pythagoras(int sisiA, int sisiB){
        double pythagoras;
        return  pythagoras = Math.sqrt((sisiA*sisiA)+(sisiB*sisiB));
    }
}
