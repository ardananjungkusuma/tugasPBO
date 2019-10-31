package js1;
/**
 *
 * @author ardan
 */
public class sepedaDemo {
    public static void main(String[] args){
        //membuat dua objek sepeda
        sepeda spd1=new sepeda();
        sepeda spd2=new sepeda();
        sepedaGunung spd3 = new sepedaGunung();
        
        //memanggil method didalam objek sepeda
        spd1.setMerk("Polygon");
        spd1.setWarna("Merah");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.checkStatus();
        
        spd2.setMerk("Wim Cycle");
        spd2.setWarna("Biru Dongker");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.checkStatus();
        
        spd3.setMerk("Klinee");
        spd3.setWarna("Green Army");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(3);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.checkStatus();
    }
}
