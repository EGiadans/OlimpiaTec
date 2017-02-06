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
public class Time { //Atributes
    private int hour;
    private int minute;
    private int second; 
    //Constructor
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //Getters and Setters
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){ //Setter for the whole 
        this.hour=hour;                             //Time object
        this.minute=minute;
        this.second=second;
    }
    @Override
    public String toString(){
        return String.format("%02d",this.hour)+":"+String.format("%02d",this.minute)+
                ":"+String.format("%02d",this.second);
    }
    public Time nextSecond(){ //Condition, if the second is 59 and we increase it by 1
        Time x=new Time(this.hour,this.minute,this.second); //the change will aply to the 
        x.second+=1;                                        //rest of the Time value
        if (x.second==60){
            x.second=00;
            x.minute+=1;
            if (x.minute==60){
                x.minute=0;
                x.hour+=1;
                if (x.hour==23){
                    x.hour=00;
                }
            }
        }
        return x;         
    }
    public Time previousSecond(){ //Condition, opposite way, but the change will also
        Time x=new Time(this.hour,this.minute,this.second);//apply, 
        x.second-=1;
        if (x.second==0){
            x.minute-=1;
            if (x.minute==0){
                x.hour-=1;
                if (x.hour==0)
                    x.hour=23;
            }
        }
        
        return x;
    }

}
