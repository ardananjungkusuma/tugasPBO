/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractClass;

/**
 *
 * @author ardan
 */
public abstract class Hewan {
    private int umur;
    protected Hewan(){
        this.umur = 0;
    }

    public int getUmur() {
        return umur;
    }
    
    public void bertambahUmur(){
        this.umur +=1;
    }
    
    public abstract void bergerak();
}
