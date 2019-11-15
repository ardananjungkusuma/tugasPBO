package js10;

/**
 *
 * @author ardan
 */
public class PermanentEmployee extends Employee implements IPayable{
    private int salary;

    public PermanentEmployee(String name,int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmount(){
        return (int) (salary+0.05*salary);
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent Employee With salary "+salary+"\n";
        return info;
    }
    
}
