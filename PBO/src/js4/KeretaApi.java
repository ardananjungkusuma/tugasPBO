package js4;

/**
 *
 * @author ardan
 */
public class KeretaApi {
    private String namaKereta;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String namaKereta, String kelas, Pegawai masinis) {
        this.namaKereta = namaKereta;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String namaKereta, String kelas, Pegawai masinis, Pegawai asisten) {
        this.namaKereta = namaKereta;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai getMasinis() {
        return masinis;
    }

    public void setMasinis(Pegawai masinis) {
        this.masinis = masinis;
    }

    public Pegawai getAsisten() {
        return asisten;
    }

    public void setAsisten(Pegawai asisten) {
        this.asisten = asisten;
    }
    
    public String info(){
        String info = "";
        info += "Nama : "+this.namaKereta+"\n";
        info += "Kelas : "+this.kelas+"\n";
        info += "Masinis : \n"+this.masinis.info()+"\n";
        //info += "Asisten : \n"+this.asisten.info()+"\n";
        return info;
    }
}
