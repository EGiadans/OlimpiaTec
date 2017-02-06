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
public class Account { //Atributes
    private String id;
    private String name;
    private int balance=0;
    
    public Account (String id, String name){
        this(id,name,0); //Significa ejecute otro constructor que si cumpla con los parametros
    }
    public Account (String id, String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=0;
    }
    //Getters and Setters
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    public int credit(int amount){ //method credit increases the balance with the given amount
        this.balance+=amount;
        return this.balance;
    }
    public int debit(int amount){ //method debit does the opposite
        if (amount<=this.balance){ //you cannot withdraw more than your balance
            this.balance-=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public int transferTo(Account another,int amount){ //transference method
        if (amount<=this.balance){  //between different account instances
            another.credit(amount);
            this.balance-=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    
    @Override
    public String toString(){
        return "Account[id= "+this.id+" name= "+this.name+" balance= "+ this.balance; 
    }
}
