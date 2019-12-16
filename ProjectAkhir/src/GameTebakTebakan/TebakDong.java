package GameTebakTebakan;

/**
 *
 * @author ardan & wahyu
 */
public abstract class TebakDong implements ITebak{
    int temp;
    
    
    @Override
    public int acakAngkanya(){
        return temp;
    }
}
