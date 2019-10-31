/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinauUTS2;

/**
 *
 * @author ardan
 */
public class Pampkin {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.fill();
    }
}
class Shape{
        public void draw(){
            System.out.println("A");
        }
        public void fill(){
            System.out.println("fill");
        }
    }

class Square extends Shape{
    public void draw(){
        System.out.println("Square");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
