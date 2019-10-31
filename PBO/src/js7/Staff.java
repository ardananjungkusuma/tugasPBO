package js7;

/**
 *
 * @author ardan
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;

    public int getLembur() {
        return lembur;
    }

    public void setLembur(int lembur) {
        this.lembur = lembur;
    }

    public double getGajiLembur() {
        return gajiLembur;
    }

    public void setGajiLembur(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }
    
    public double getGaji(int lembur,double gajiLembur){
        return super.getGaji()+lembur*gajiLembur;
    }//this line is overloading

    @Override
    public double getGaji() {
        return super.getGaji()+lembur*gajiLembur; 
    }
    
    public void lihatInfo(){
        System.out.println("NIP : "+this.getNip());
        System.out.println("Nama : "+this.getNama());
        System.out.println("Golongan : "+this.getGolongan());
        System.out.println("Jml Lembur : "+this.getLembur());
        System.out.println("Gaji Lembur: "+this.getGajiLembur());
        System.out.println("Gaji : "+this.getGaji());
        
    }
    
}
