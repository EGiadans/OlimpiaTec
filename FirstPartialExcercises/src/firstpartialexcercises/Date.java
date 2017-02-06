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
public class Date { //Atributes
    private int day;
    private int month;
    private int year;
    //Constructor
    public Date(int day, int month, int year){ 
        this.day=day;
        this.month=month;
        this.year=year;
    }
    //Getters and Setters
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    } 
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day, int month, int year){ //Setter for the complete Date value
        this.day=day;
        this.month=month;
        this.year=year;
    }
    @Override
    public String toString(){ //We use this function to give a format to our values
        return String.format("%02d", this.day)+"/"+
                String.format("%02d",this.month)+"/"+
                String.format("%04d", this.year);
        
    }
    
    
    
}
