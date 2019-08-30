package js1;

/**
 *
 * @author ardan
 */
public class senjata {
    private String namaSenjata,jenisSenjata,tipeSenjata,posisi;
    private int kapasitasPeluru=0,tambahPeluru;
    
    public void setNamaSenjata(String newValue){
        namaSenjata=newValue;
    }
    public void setJenisSenjata(String newValue){
        jenisSenjata=newValue;
    }
    public void setTipeSenjata(String newValue){
        tipeSenjata=newValue;
    }
    public void setPosisiSenjata(String newValue){
        posisi=newValue;
    }
    public void setKapasitasPeluru(int setBullet){
        kapasitasPeluru=setBullet;
    }
    public void tambahPeluru(int addBullet){
        tambahPeluru=addBullet;
    }
    
    public void checkWeaponStatus(){
        System.out.println("Nama Senjata: "+namaSenjata);
        System.out.println("Jenis Senjata: "+jenisSenjata);
        System.out.println("Tipe Senjata: "+tipeSenjata);
        System.out.println("Kapasitas Peluru : "+kapasitasPeluru);
        System.out.println("Peluru Saat Ini: "+tambahPeluru);
        System.out.println("Posisi Senjata: "+posisi);
    }
    
}
