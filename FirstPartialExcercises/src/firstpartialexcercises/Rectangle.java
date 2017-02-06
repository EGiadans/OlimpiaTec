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
public class Rectangle {
    private float length;
    private float width;
    
    public Rectangle(){
        
    }
    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length=length;
    }
    public float getWidth(){
        return this.width; 
    }
    public void setWidth(float width){
        this.width=width;
    }
    public double getArea(){
        return this.width*this.length;
    }
    public double getPerimeter(){
        return (2*this.width)+(2*this.length);
    }
    @Override
    public String toString(){
        return "Rectangle[length= "+this.length+",width= "+this.width+"]";
    }
       
        
    }
    
