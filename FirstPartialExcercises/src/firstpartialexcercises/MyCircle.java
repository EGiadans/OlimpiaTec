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
public class MyCircle { //Atributes
    private MyPoint center;
    private int radius;
    //Constructors
    public MyCircle(){
        MyPoint centro=new MyPoint(0,0);
        this.center=centro;
        this.radius=1;
    }
    public MyCircle(int x, int y, int radius){
        this.center.setXY(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    //Getters and Setters
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){ //getter for the center coordinate in array form 
        int[] arregloCirc= new int[2];
        arregloCirc[0]=this.center.getX();
        arregloCirc[1]=this.center.getY();
        return arregloCirc;
    }
    public void setCenter(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    @Override 
    public String toString(){
        return "MyCircle[radius: "+this.radius+", center: "+center.toString();
    }
    public double getArea(){ //method for the area calculus
        double aC;
        aC=Math.pow(this.radius,2)*Math.PI;
        return aC;
    }
    public double getCircumference(){ //method for the perimeter calculus
        double circum;
        circum=Math.PI*(this.radius*2);
        return circum;
    }
    public double distance(MyCircle another){ //we calculate the distance between 
        double dist;                //this circle and another instance of circle
        dist=another.center.distance(another.center);
        //dist=Math.sqrt(Math.pow(another.center.getX()-this.center.getX(),2)
        //        +Math.pow(another.center.getY()-this.center.getY(),2));
        return dist;
    }
           
    
}
