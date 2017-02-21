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
public class Integrante {
    private String nombre;
    private int numero;
    
    public Integrante (String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }

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
    public String toString(){
        return "Nombre: "+this.nombre+", numero: "+this.numero;
    }
}
