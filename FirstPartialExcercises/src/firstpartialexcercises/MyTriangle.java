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
public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1,int y1,int x2,int y2,int x3,int y3){
        MyPoint vert1=new MyPoint(x1,y1);
        this.v1=vert1;
        MyPoint vert2=new MyPoint(x2,y2);
        this.v2=vert2;
        MyPoint vert3=new MyPoint(x3,y3);
        this.v3=vert3;
        /*this.v1.setX(x1);
        this.v1.setY(y1);
        this.v2.setX(x2);
        this.v2.setY(y2);
        this.v3.setX(x3);
        this.v3.setY(y3);*/
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override
    public String toString(){
        return "MyTriangle[v1= "+this.v1+", v2= "+this.v2+", v3= "+this.v3;
    }
    public double getPerimeter(){
        double dist1,dist2,dist3,perim;
        dist1=this.v1.distance(v2);
        dist2=this.v2.distance(v3);
        dist3=this.v3.distance(v2);
        perim=dist1+dist2+dist3;
        return perim;
    }
    
    public String getType(){
        double a=this.v1.distance(v2);
        double b=this.v2.distance(v3);
        double c=this.v3.distance(v2);
        
        if (a==b&&b==c&&c==a){
            return "Equilateral";
        }
        else if (a==b||b==c||c==a){
            return "Isosceles";  
        }
        else{ 
            return "Scalene";
        }
    }
        
    
            
}
