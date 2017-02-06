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
public class MyRectangle { //Atributes
    private MyPoint topLeft;
    private MyPoint bottomRight;
    //Constructors
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft=new MyPoint(x1,y1);
        this.bottomRight=new MyPoint (x2,y2);
    }
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft=topLeft;
        this.bottomRight=bottomRight;
    }
    //Getters and Setters with diferent parameters
    public MyPoint getTopLeft(){
        return this.topLeft;
    }
    public MyPoint getBottomRight(){
        return this.bottomRight;
    }
    public void setTopLeft(MyPoint topLeft){
        this.topLeft=topLeft;    
    }
    public void setTopLeft(int x, int y){
        this.topLeft.setXY(x, y);
    }
    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight=bottomRight;
    }
    public void setBottomRight(int x, int y){
        this.bottomRight.setXY(x,y);
    }
    @Override
    public String toString(){
        return "MyRectangle[topLeft: "+this.topLeft+", bottomRight: "+this.bottomRight
                +" area: "+this.getArea()+" perimeter: "+this.getPerimeter();
    }
    public double getArea(){ //Calculation of area, using distance between coordinates
        return (this.topLeft.getX()-this.bottomRight.getX())*
                (this.topLeft.getY()-this.bottomRight.getY());
    }
    public double getPerimeter(){ //Calculation of perimeter, using distance between coordinates
        return ((this.topLeft.getX()-this.bottomRight.getX())+
                (this.topLeft.getY()-this.bottomRight.getY()))*2;
    }
    
    
}
