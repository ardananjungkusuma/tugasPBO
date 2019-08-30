package js1;
import java.util.Scanner;
/**
 *
 * @author ardan
 */
public class sepedaDemo {
    public static void main(String[] args){
        //membuat dua objek sepeda
        sepeda spd1=new sepeda();
        sepeda spd2=new sepeda();
        
        //memanggil method didalam objek sepeda
        spd1.setMerk("Polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.checkStatus();
        
        spd2.setMerk("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.checkStatus();
    }
}
