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
public class Tester {
    public static void main(String[] args) {
        Singa s = new Singa("singa","groarr",4,"Carnivora");
        Gajah g = new Gajah("gajah","treeett",4,"Herbivora");
        Harimau h = new Harimau("harimau","rawwwrrrr",4,"Carnivora");
        BurungHantu bH = new BurungHantu("burung hantu","hoothooott",2,"Omnivora");
        Sapi sap = new Sapi("sapi","moooo",4,"Herbivora");
        Petugas p = new Petugas();
        System.out.println("Jam ---->0");
        System.out.println(""+s.getHewanInfo());
        System.out.println(""+h.getHewanInfo());
        System.out.println(""+g.getHewanInfo());
        System.out.println(""+bH.getHewanInfo());
        System.out.println(""+sap.getHewanInfo());
        
        for (int i = 1; i <= 23; i++) {
            System.out.println("Jam ----> "+i);
            if(i == 1 || i==3 || i == 9 || i==11 || i==13 || i == 17 || i == 19 || i == 23){
                System.out.println("       ~~~Hewan Masih Pada Kenyang~~~");
            }
            p.kasihMakan(s,i);
            p.kasihMakan(h, i);
            p.kasihMakan(g, i);
            p.kasihMakan(bH, i);
            p.kasihMakan(sap, i);
        }
    }
}
