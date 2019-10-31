package pbo;
/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class luasLingkaran {
    public static void main(String[] args){
        float jari2;
        String jawab;
        double luas;
        Scanner input = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        System.out.println("Program Luas Lingkaran");
        do{
        System.out.print("Input: ");
        jari2=input.nextFloat();
        luas = 3.1415*jari2*jari2;
        if(jari2>0){
            System.out.println("Output: "+luas);
        }else{
            System.out.println("Jari Jari tidak boleh kurang dari 0");
        }
            System.out.print("Apakah anda ingin mengulangi? y/t : ");
            jawab = i.nextLine();
        }
        while(jawab.equals("y"));
    }    
}