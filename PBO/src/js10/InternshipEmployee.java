package js10;

/**
 *
 * @author ardan
 */
public class InternshipEmployee extends Employee {
    private int length;

    public InternshipEmployee(String name,int length) {
        this.name = name;
        this.length = length;
    }
    
    public int getLength(){
        return length;
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as Internship employee for "+length+" month/s\n";
        return info;
    }
}
