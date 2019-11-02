package js10.tugas;

/**
 *
 * @author ardan
 */
public class Zombie implements IDestroyable{
    protected int health;
    protected int level;
    
    public void heal(){
        System.out.println("Zombie Healed!");
    }
    
    @Override
    public void destroyed(){
        System.out.println("Zombie Destroyed!");
    }
    
    public String getZombieInfo(){
        return "Health = "+health+"\nLevel: "+level;
    }
}
