package js10.tugas;

/**
 *
 * @author ardan
 */
public class Barrier implements IDestroyable{
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    @Override
    public void destroyed(){
        this.strength -= this.strength * 0.1;
    }
    
    public String getBarrierInfo(){
        return "\nBarrier Strength: "+getStrength()+"\n";
    }
}
