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
public class Circle {
    private double radius; //Atribute
    //Constructors
    public Circle(){
        this(1.0);
    }
    public Circle(double radius){
        this .radius=radius;
    }
    //Getters and Setters
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){ //method for the area obtention
        return this.radius*this.radius*Math.PI;
    }
    public double getCircumference(){//method for the circumference obtention
        return this.radius*2*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius= "+this.radius+"]";
    }
}
