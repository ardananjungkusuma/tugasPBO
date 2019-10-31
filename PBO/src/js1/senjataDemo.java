package js1;

/**
 *
 * @author ardan
 */
public class senjataDemo {
    public static void main(String[] args){
        senjata gun1=new senjata();
        senjata gun2=new senjata();
        senjataLarasPanjang gun3=new senjataLarasPanjang();
        System.out.println("---------------------------------------");
        gun1.setNamaSenjata("Machete");
        gun1.setJenisSenjata("Short Range");
        gun1.setTipeSenjata("Melee Weapon");
        gun1.setKapasitasPeluru(0);
        gun1.tambahPeluru(0);
        gun1.setPosisiSenjata("Ready to Use");
        gun1.checkWeaponStatus();
        System.out.println("---------------------------------------");
        gun2.setNamaSenjata("Desert Eagle");
        gun2.setJenisSenjata("Short-Medium Range");
        gun2.setTipeSenjata("Pistol");
        gun2.setKapasitasPeluru(50);
        gun2.tambahPeluru(25);
        gun2.setPosisiSenjata("Ready to Reload & Shoot");
        gun2.checkWeaponStatus();
        System.out.println("---------------------------------------");
        gun3.setNamaSenjata("KARABINER 98 KURZ");
        gun3.setJenisSenjata("Medium-Long Range");
        gun3.setTipeSenjata("Rifle");
        gun3.setKapasitasPeluru(20);
        gun3.tambahPeluru(19);
        gun3.setTipeScope("SWFA SS 3-15x42 Tactical Rifle Scope");
        gun3.setPosisiSenjata("Ready to Aim and Shoot");
        gun3.checkWeaponStatus();
        System.out.println("---------------------------------------");
        
        
    }
}
