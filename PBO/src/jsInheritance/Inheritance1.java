package jsInheritance;

/**
 *
 * @author ardan
 */
public class Inheritance1 {
    public static void main(String[] args) {
        StaffTetap st = new StaffTetap("Ardan","Malang","Laki laki",20,2000000,250000,200000,"2A",100000);
        st.tampilStaffTetap();
        
        StaffHarian sh = new StaffHarian("Indah","Malang","Perumpuan",27,10000,100000   ,50000,100);
        sh.tampilStaffHarian();
        
    }
}
