package js4;

/**
 *
 * @author ardan
 */
public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi = new Kursi[0];
    
    private void initKursi(){
        for(int i=0;i<arrayKursi.length;i++){
            this.arrayKursi[i]=new Kursi(String.valueOf(i+i));
        }
    }
    
    public Gerbong(String kode,int jumlah){
        this.kode=kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    public String info(){
        String info = "";
        info += "Kode : "+kode+"\n";
        for(Kursi kursi : arrayKursi){
            info += kursi.info();
        }
        return info;
    }

    public void setPenumpang(Penumpang penumpang,int nomer){
        this.arrayKursi[nomer-1].setPenumpang(penumpang);
    }
    
    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
}
