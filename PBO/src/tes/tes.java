package tes;

///**
// *
// * @author ardan
// */
//public class tes {
//    String name, code;
//    double total;
//    int price;
//    double discount;
//    
//    double sellingPrice(int price, double discount){
//        total = price - (price*discount);
//        return total;
//    }
//}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class tes {
String name, code;
int price;
double discount,total;

double sellingPrice(int price, double discount){
   total = price - (price*discount);
   return total;
}

void showData(){
    System.out.println("Nama barang : "+name);
    System.out.println("Kode barang : "+code);    
    System.out.println("Harga barang : "+price);
    System.out.println("Diskon : "+discount);
    System.out.println("Total : "+sellingPrice(price,discount));
    
}

public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    tes smt = new tes();
    
    System.out.print("Nama barang : ");
    smt.name = sc.nextLine();
    System.out.print("Kode barang : ");
    smt.code = sc.nextLine();
    System.out.print("Harga barang : ");
    smt.price = sc.nextInt();
    System.out.print("Diskon : ");
    smt.discount = sc.nextDouble();
    
    smt.sellingPrice(0, 0);
    smt.showData();
}
}