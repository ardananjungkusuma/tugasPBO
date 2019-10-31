package js3;

/**
 *
 * @author ardan
 */
public class AnggotaKoperasi {
    private String nama,noKtp;
    private float pinjam,angsur;
    private float limitPinjam;

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public AnggotaKoperasi(String noKtp,String nama,float limitPinjam) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getPinjam() {
        return pinjam;
        
    }

    public float getlimitPinjam(){
        return limitPinjam;
    }
    
    public void setPinjam(float pinjamMasuk) {
        if(pinjamMasuk>limitPinjam){
            System.out.println("Maaf Pinjaman anda melebihi limit");
            pinjam = 0;
        }else{
            pinjam = pinjamMasuk;
        }
    }

    public float getAngsur() {
        return angsur;
    }

    public void setAngsur(float masukAngsur) {
        float totalAngsur = 0.1f*pinjam;
        if(masukAngsur<totalAngsur){
            System.out.println("Angsuran Minimal 10% Pinjaman!");
        }else{
            if(pinjam>0){
            pinjam = pinjam - masukAngsur;
            }else{
            System.out.println("Pinjaman Anda 0");
            }
        }
    }
}
