/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author ardan
 */
public class Petugas {
    public void kasihMakan(IMakan m,int i){
            if(m instanceof Gajah){
            Gajah g = (Gajah) m;
            g.makan(i);
        }else if(m instanceof BurungHantu){
            BurungHantu bH = (BurungHantu) m;
            bH.makan(i);
        }else if(m instanceof Singa){
            Singa s = (Singa) m;
            s.makan(i);
        }else if(m instanceof Harimau){
            Harimau h = (Harimau) m;
            h.makan(i);
        }else if(m instanceof Sapi){
            Sapi s = (Sapi) m;
            s.makan(i);
        }
        
        
    }
}
