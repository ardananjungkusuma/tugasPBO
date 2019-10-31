package js3;

/**
 *
 * @author ardan
 */
public class EncapDemo {
    private String nama;
    private int age;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if(newAge>30){
            age = 30;
        }else if(newAge<18){
            age = 18;
        }else{
            age = newAge;
        }
    }
}
