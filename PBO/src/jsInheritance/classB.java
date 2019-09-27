package jsInheritance;

/**
 *
 * @author ardan
 */
public class classB extends classA{
    private int z;

    public void setZ(int z) {
        this.z = z;
    }
    
    public void getNilaiZ(){
        System.out.println("nilai z : "+z);
    }
    public void getJumlah(){
        System.out.println("Jumlah "+(super.getX()+super.getY()+z));
    }
}
