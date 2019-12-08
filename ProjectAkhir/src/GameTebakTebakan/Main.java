/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTebakTebakan;

/**
 *
 * @author ardan
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TebakGame1 tebakGame1 = new TebakGame1();
        UserTebak user1 = new UserTebak();
        
        int jumlah,tebakNih;
        int idGame = (int) (Math.random() * 100000);
        int angkaFinal = tebakGame1.acakAngkanya();
        System.out.println("ID GAME : "+idGame);
        System.out.println("Tebak Angka (1-100)");
        jumlah = 0;
        do {
            jumlah++;
            System.out.print("Masukan Tebakan Anda yang ke-"+jumlah+" = ");
            tebakNih = sc.nextInt();
            user1.setTebakanUser(tebakNih);
            if (user1.getTebakanUser() > angkaFinal) {
                System.out.println("Tebakan Terlalu Besar");
            } else if (user1.getTebakanUser() < angkaFinal) {
                System.out.println("Tebakan Terlalu Kecil");
            } else if (user1.getTebakanUser() == angkaFinal){
                System.out.println("Tebakan Benar! Setelah " + jumlah + " Kali Menebak");
            } else{
                System.out.println("Undefined");
            }
        } while (user1.getTebakanUser() != angkaFinal);
    }
}
