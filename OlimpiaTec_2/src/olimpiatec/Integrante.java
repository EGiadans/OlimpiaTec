/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author Eduardo
 */
public class Integrante { //Attributes
    private String nombre;
    private int numero;
    //Constructor
    public Integrante (String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    @Override 
    public String toString(){ //String with the details of the member 
        return "Nombre: "+this.nombre+", numero: "+this.numero;
        
    }
}
