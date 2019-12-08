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
public class Plant {
    public void doDestroy(IDestroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie) d;
            wz.destroyed();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.destroyed();
        }else{
            Barrier b = (Barrier) d;
            b.destroyed();
        }
    }
    
    public void doHeal(IDestroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie wz = (WalkingZombie) d;
            wz.heal();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jz = (JumpingZombie) d;
            jz.heal();
        }else{
            Barrier b = (Barrier) d;
            
        }
    }
}
