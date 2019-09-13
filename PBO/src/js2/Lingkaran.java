package js2;

/**
 *
 * @author ardan
 */
public class Lingkaran {
    public double phi=3.14,r,luas,keliling;
    double hitungLuas(double r){
        luas = phi * r * r;
        return luas;
    }
    double hitungKeliling(double r){
        keliling = 2 * phi * r;
        return keliling;
    }
    public void tampilHasil(){
        System.out.println("Jari Jari : "+r);
    }
}
