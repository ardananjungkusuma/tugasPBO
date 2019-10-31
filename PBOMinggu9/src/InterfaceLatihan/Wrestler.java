/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceLatihan;

/**
 *
 * @author ardan
 */
public abstract class Wrestler {
    protected String name;
    protected float salary;
    
    public float salaryWrestler(float hours){
        this.salary = 100 * hours;
        return this.salary;
    }
    
    public Wrestler(String name){
        this.name = name;
    }
    
    public void bertandingDiRing(){
        System.out.println("Profile of Wrestler "+name);
        System.out.println("The Salary of Wrestler is "+salary);
    }
}
