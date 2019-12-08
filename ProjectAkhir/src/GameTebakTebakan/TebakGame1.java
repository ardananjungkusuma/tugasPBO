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
public class TebakGame1 extends TebakDong {
    Scanner sc = new Scanner(System.in);
    UserTebak user;

    @Override
    public int acakAngkanya() {
        int randomAngka;
        randomAngka = (int) (Math.random() * 100);
        return randomAngka;
    }
}
