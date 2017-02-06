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
public class Circle1 {
    private double radius;
    private String color;
    
    public Circle1(){
        radius=1.0;
        color="red";
        //this(1.0,"red");
    }
    public Circle1(double radius){
        this.radius=radius;
        this.color="red";
        //this(radius,"red");
    }
    public Circle1(String color){ //Constructor extra
        this.radius=1.0;
        this.color=color;
        //this(1.0, color);
    }
    public Circle1(double radius, String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    
    @Override //Debido a que es un metodo comun de Java 
    public String toString(){
        //Manera larga de hacerlo
        /*String temp;
        temp="Circle [radius= "+this.radius +" ,color = "+this.color+"]";
        return temp;
        */
        return "Circle [radius= "+this.radius +" ,color = "+this.color+"]";
    }
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    
    
}
