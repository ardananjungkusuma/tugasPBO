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
public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5,"R1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanentEmployee pEmp = new PermanentEmployee("Dedok",500);
        ow.pay(pEmp);
        System.out.println("--------------------------------");
        
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto",5);
        ow.showEmployee(pEmp);
        System.out.println("-----------------------------------");
        ow.showEmployee(iEmp);
    }
}
