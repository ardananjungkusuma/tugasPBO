/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimor1;

/**
 *
 * @author ardan
 */
public class PermanentEmployee extends Employee implements IPayable {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public PermanentEmployee(String name,int salary) {
        this.salary = salary;
        this.name = name;
    }
    
    @Override
    public int getPaymentAmount() {
        return (int)(salary+0.05*salary);
    }
    
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }
    
    
}
