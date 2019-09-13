package pbo;

import java.util.Scanner;

/**
 *
 * @author ardan
 */
public class konversiSuhu {
    double konversiSuhuKeCelcius(double s,char t){
        double hasil=0;
        if(t == 'R' || t == 'r'){
            hasil = 4*s/5;
        }else if(t == 'f'||t == 'F'){
            hasil = (9*s/5)+32;
        }else if(t == 'k'||t == 'K'){
            hasil = s + 273;
        }else{
            hasil = 0;
        }
        return hasil;
    }
    public static void main(String[] args){
        konversiSuhu konvert = new konversiSuhu();
        String jawab;
        double suhu;
        char tipe;
        Scanner i = new Scanner(System.in);
        Scanner iString = new Scanner(System.in);
        Scanner iChar = new Scanner(System.in);
        do{
        System.out.print("Input Suhu: ");
        suhu=i.nextDouble();
        System.out.print("Input Tipe : ");
        tipe = iChar.next().charAt(0);
        konvert.konversiSuhuKeCelcius(suhu, tipe);
        System.out.println("Output: "+konvert.konversiSuhuKeCelcius(suhu, tipe));
        
        System.out.print("Apakah anda ingin mengulangi lagi? y/t: ");
        jawab = iString.nextLine();
        }while(jawab.equals("y"));
        
    }
    
}
