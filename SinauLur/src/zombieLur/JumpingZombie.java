/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieLur;

/**
 *
 * @author ardan
 */
public class JumpingZombie extends Zombie{

    public JumpingZombie(int health,int level) {
        this.health = health;
        this.level = level;
    }
    
     @Override
    public void heal(){
        if(this.level == 1){
            this.health += this.health * 30/100;
        }else if(this.level ==2){
            this.health += this.health * 40/100;
        }else{
            this.health += this.health * 50/100;
        }
    }
    
    @Override
    public void destroyed(){
        this.health -= this.health * 10/100;
    }
    
    public String getZombieInfo(){
        return "Jumping Zombie\nZombie Health : "+this.health+"\nZombie Level: "+this.level;
    }
    
}
