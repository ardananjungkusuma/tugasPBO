package js3;

/**
 *
 * @author ardan
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn=true;
        kecepatan=0;
    }
    public void matikanMesin(){
        kontakOn=false;
        kecepatan=0;
    }
    public void tambahKecepatan(){
        if(kontakOn==true){
            kecepatan+=20;
        }else if(kecepatan>=100){
            System.out.println("Kecepatan Maksimal 100.");
        }else{
            System.out.println("Tidak dapat menambah kecepatan karena mesin mati");
        }            
    }
    public void kurangiKecepatan(){
        if(kontakOn==true){
            kecepatan-=20;
        }else{
            System.out.println("Tidak dapat menambah kecepatan karena mesin mati");
        }
    }
    
    public void printStatus(){
        if(kontakOn==true){
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+kecepatan+"\n");
    }
}
