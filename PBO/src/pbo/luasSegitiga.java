package pbo;

import java.util.Scanner;

/**
 *
 * @author ardan
 */
public class luasSegitiga {
    public static void main(String[] args){
        float a,t;
        String jawab;
        double luas;
        Scanner input = new Scanner(System.in);
        Scanner i = new Scanner(System.in);
        System.out.println("Program Luas Segitiga");
        do{
        System.out.print("Input: ");
        a=input.nextFloat();
        t=input.nextFloat();
        luas = 0.5*a*t;
        if(a>0&&t>0){
            System.out.println("Output: "+luas);
        }else{
            System.out.println("Alas/Tinggi tidak boleh kurang dari 0");
        }
            System.out.print("Apakah anda ingin mengulangi? y/t : ");
            jawab = i.nextLine();
        }
        while(jawab.equals("y"));
    } 
}
