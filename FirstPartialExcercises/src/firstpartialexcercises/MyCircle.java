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
public class MyCircle {
    private MyPoint center;
    private int radius;
    
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
    public void setCenteryY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
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
    public double getArea(){
        double aC;
        aC=Math.pow(this.radius,2)*Math.PI;
        return aC;
    }
    public double getCircumference(){
        double circum;
        circum=Math.PI*(this.radius*2);
        return circum;
    }
    public double distance(MyCircle another){
        double dist;
        dist=Math.sqrt(Math.pow(another.center.getX()-this.center.getX(),2)
                +Math.pow(another.center.getY()-this.center.getY(),2));
        return dist;
    }
           
    
}
