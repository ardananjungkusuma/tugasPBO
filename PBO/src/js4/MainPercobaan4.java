package js4;

/**
 *
 * @author ardan
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang p = new Penumpang("12345","Mr.Krab");
        Gerbong gerbong = new Gerbong("A",10);
        Penumpang p1 = new Penumpang("67890","Budie");
        
        gerbong.setPenumpang(p,3);
        gerbong.setPenumpang(p1,5);
        System.out.println(gerbong.info());
    }
}
