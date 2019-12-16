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
