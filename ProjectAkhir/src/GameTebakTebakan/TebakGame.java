/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTebakTebakan;

/**
 *
 * @author ardan & wahyu
 */
public class TebakGame extends TebakDong {

    @Override
    public int acakAngkanya() {
        int randomAngka;
        randomAngka = (int) (Math.random() * 100);
        return randomAngka;
    }
}
