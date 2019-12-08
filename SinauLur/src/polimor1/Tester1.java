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
public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik",500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ElectricityBill eBill = new ElectricityBill(5, "R1");
        
        Employee e;
        IPayable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
