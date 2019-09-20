package js4;

/**
 *
 * @author ardan
 */
public class PegawaiRoti {
    private String idPegawai;
    private String namaPegawai;
    
    public PegawaiRoti(){
        
    }

    public String getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(String idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public void info(){
        System.out.println("==============================================");
        System.out.println("\t\tDETAIL PELAYANAN");
        System.out.println("Nama Pegawai: "+namaPegawai);
    }
}
