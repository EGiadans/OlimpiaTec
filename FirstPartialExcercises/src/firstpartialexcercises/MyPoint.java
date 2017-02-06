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
public class MyPoint { //Atributes
    private int x;
    private int y;
    //Constructors
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){
        this.x=x;
        this.y=y;
    }
    //Getters and Setters
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int[] getXY(){ //Getter for an array form of our coordinate
        int[] arreglo= new int[2];
        arreglo[0]=this.x;
        arreglo[1]=this.y;
        return arreglo;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }
    public double distance(int x, int y){ //calculation of distance from this point to a given 
        double dist;                        //set of coordinates
        dist=Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2)); 
        return dist;
    }
    public double distance(MyPoint another){ //calculation of distance from our point 
        double dist;                    //to another instance of point
        dist=Math.sqrt(Math.pow(another.x-this.x,2)+Math.pow(another.y-this.y,2));
        return dist;
    }
    public double distance(){ //calculation from our point to the origin (0,0)
        double dist;
        dist=Math.sqrt(Math.pow(0-x,2)+Math.pow(0-y,2));
        return dist;
    }
}
