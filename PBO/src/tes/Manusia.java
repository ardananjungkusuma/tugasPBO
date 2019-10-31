package tes;

/**
 *
 * @author ardan
 */
public class Manusia {
    public void nyalakanPerangkat(Elektronik e){
        if(e instanceof TelevisiJadul){
            System.out.println("Nyalakan televisi jadul dengan input: "+((TelevisiJadul)e).getModeInput());
        }else if(e instanceof TelevisiModern){
            System.out.println("Nyalakan televisi jadul dengan input : "+((TelevisiModern)e).getModeInput());
        }else{
            System.out.println("Televisi Tidak Benar");
        }
        System.out.println("Voltase Televisi : "+e.getVoltase());
    }
}
