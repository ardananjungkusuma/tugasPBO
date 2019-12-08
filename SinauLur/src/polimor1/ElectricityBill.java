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
public class ElectricityBill implements IPayable{
    private int kwh;
    private String category;

    public int getKwh() {
        return kwh;
    }

    public void setKwh(int kwh) {
        this.kwh = kwh;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ElectricityBill(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }
    
    @Override
    public int getPaymentAmount() {
        return kwh*getBasePrice();
    }
    
    public int getBasePrice(){
        int bPrice = 0;
        switch(category){
            case "R1":
                bPrice = 100;
                break;
            case "R2":
                bPrice = 200;
                break;
        }
        return bPrice;
    }
    
    public String getBillInfo(){
        return "kWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePrice()+" per kWH)\n";
    }
}
