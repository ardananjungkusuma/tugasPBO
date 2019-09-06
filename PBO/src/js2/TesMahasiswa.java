package js2;

/**
 *
 * @author ardan
 */
public class TesMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolio NO 1A";
        mhs1.kelas= "1A";
        mhs1.tampilBiodata();
        System.out.println("----------------");
        mhs2.nim = 102;
        mhs2.nama="Ardan";
        mhs2.alamat="Jl. Senggani NO 20";
        mhs2.kelas= "2B";
        mhs2.tampilBiodata();
        System.out.println("----------------");
        mhs3.nim = 103;
        mhs3.nama="Rasyid";
        mhs3.alamat="Jl Semanggi Barat NO 15";
        mhs3.kelas= "2A";
        mhs3.tampilBiodata();
    }
}
