package pbo;
import java.util.Scanner;
/**
 *
 * @author ardan
 */
public class themePark {
    boolean tesKategori(int t,int b,int k){
        if(t>100&&b<=150){
            if(k==2||k==3||k==4){
                return true;    
            }else{
                return false;
            }
        }else if(t<=100&&b<=150){
            if(k==1||k==2){
                return true;    
            }else{
                return false;
            }
        }else if(t<=100&&b>150){
            if(k==2){
                return true;    
            }else{
                return false;
            }
        }else if(t>100&&t<=200&&b>150){
            if(k==2||k==3){
                return true;    
            }else{
                return false;
            }
        }else if(t>200&&b>150){
            if(k>=0){
                k=0;
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        themePark tP = new themePark();
        String jawab;
        Scanner i = new Scanner(System.in);
        Scanner iString = new Scanner(System.in);
        do{
        System.out.print("Input: ");
        int ti= i.nextInt();
        int be= i.nextInt();
        int ka= i.nextInt();
        tP.tesKategori(ti, be, ka);
        if(tP.tesKategori(ti, be, ka)==false){
            System.out.println("Tidak Boleh");
        }else{
            System.out.println("Boleh");
        }
            System.out.print("Apakah anda ingin mengulangi lagi? y/t: ");
            jawab = iString.nextLine();
        }while(jawab.equals("y"));
        }
}
