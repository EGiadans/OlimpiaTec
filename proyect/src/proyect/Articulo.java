/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

/**
 *
 * @author Eduardo
 */
public class Articulo { //Creamos la clase Articulo con sus correspondientes atributos
    public int sku;
    protected int existencia;
    protected double precio;
    protected double costo;
    public String descripcion;
    
    public Articulo (int sku,double precio, String descripcion){ //Inicializamos atributos
        this.sku=sku; 
        this.existencia=0; //De acuerdo a las intrucciones, algunos se establecen en 0
        this.precio=precio;
        this.costo=0;
        this.descripcion=descripcion;
    }
    /*
    public int getSku(){
        return this.sku;
    }
    public void setSku(int sku){
        this.sku=sku;
    }
    public int getExistencia(){
        return this.existencia;
    }
    public void setExistencia(int existencia){
        this.existencia=existencia;
    }
    public double getPrecio(){
        return this.precio;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public double getCosto(){
        return this.costo;
    }
    public void setCosto(double costo){
        this.costo=costo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescrpcion(String descripcion){
        this.descripcion=descripcion;
    }
*/
    public void compra(int numArt,double costo){ //Metodo de compra de articulos
        this.existencia=existencia+numArt; //El atributo existencia se vera incrementado con el numero de articulos a comprar
        this.costo=costo; //El atributo costo se modificara de acuerdo al valor introducido 
    }
    public boolean venta(int numArtVen){ //Metodo de venta
        boolean x=true; //Establecemos una variable que decidira si la venta se realizara
        if (existencia==0){ //Si la existencia es 0 la venta no se realiza
            x=false;
        }else{
            existencia=existencia-numArtVen; //De otro modo, se hace la venta restando los articulos vendidos de la ecistencia
        }
        return x; //Aqui la variable que deci
    }
    public int verificarExistencia(){ //El metodo verificar existencia nos dara el valor del atributo existencia
        this.existencia=existencia;
        System.out.println("Metodo verificar existencia");
        return existencia;
    }
    public void actualizaPrecio(double precio){ //El metodo actualizar precio modificara el atributo precio con base en lo introducido
        this.precio=precio;
        System.out.println("Metodo actualizar precio");
    }
    
    
}

