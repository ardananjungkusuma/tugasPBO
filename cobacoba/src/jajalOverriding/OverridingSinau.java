/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajalOverriding;

/**
 *
 * @author ardan
 */
public class OverridingSinau {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.breed = "Chihuahua";
        System.out.println("Dog Breed is "+dog.breed);
        dog.eat();
        cat.breed = "Anggora";
        System.out.println("Cat Breed is : "+cat.breed);
        cat.eat();
    }
    
}
class Animal{
    String color;
    String breed;
    public void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.print("Woof!");
    }
    
    @Override
    public void eat(){
        System.out.println("Dog is Eating");
        super.eat();
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat is Eating");
        super.eat();
    }
    public void meow(){
        System.out.println("Meow");
    }
    
}

