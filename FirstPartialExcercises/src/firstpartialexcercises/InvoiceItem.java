/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexcercises;

/**
 *
 * @author Eduardo
 */
public class InvoiceItem { //Atributes
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    //Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    //Getters and Setters
    public String getId(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQty(){
        return this.qty;
    } 
    public void setQty(int qty){
        this.qty=qty;
    }
    public double getUnitPrice(){
        return this.unitPrice; 
    }
    public double getTotal(){ //total amount=multiply qty and unitPrice
        return this.unitPrice*this.qty;
    }
    @Override
    public String toString(){
        return "InvoiceItem[id= "+this.id+" desc= "+ this.desc+" qty= "+this.qty
                +" unitPrice= "+this.unitPrice+"]";
    }
}



