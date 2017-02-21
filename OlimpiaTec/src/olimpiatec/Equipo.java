/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.*;

/**
 *
 * @author Eduardo
 */
public class Equipo {
    private String deporte;
    private String nombreEq;
    private ArrayList <Integrante> integrantes ;

    public Equipo(String deporte, String nombreEq, ArrayList<Integrante> integrantes) {
        this.deporte = deporte;
        this.nombreEq = nombreEq;
        this.integrantes = integrantes;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNombreEq() {
        return nombreEq;
    }

    public void setNombreEq(String nombreEq) {
        this.nombreEq = nombreEq;
    }
    public boolean addIntegrante(String nombre, int numero){
        if (findIntegrante(nombre)==false){
            this.integrantes.add(new Integrante(nombre,numero));
            return true;
        }else{
            return false;
        }
    }
    public boolean addIntegrante(Integrante integrante){
        if (findIntegrante(integrante.getNombre())==false){
            this.integrantes.add(integrante);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeIntegrante(Integrante integrante){
        if (findIntegrante(integrante.getNombre())==true){
            this.integrantes.remove(integrante);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeIntegrante(String nombre, int numero){
        if (findIntegrante(nombre)==true){
            this.integrantes.remove(new Integrante(nombre,numero));
            return true;
        }else{
            return false;
        }
    }
    private boolean findIntegrante(String nombre){
        if (!this.integrantes.isEmpty()){
            for (Integrante integrante: integrantes){
                if (integrante.getNombre().equals(nombre)){
                    return true;
                }
            }
        }
        return false;
    }
    @Override 
    public String toString(){
        String temp;
        temp= "Equipo: "+this.nombreEq+"\n Deporte: "+this.deporte;
        
        for (Integrante integrante: integrantes){
            temp+="Integrante["+integrante.toString();//getNombre()+", Numero: "+
                    //integrante.getNumero();
        }
        return temp;        
    }
}
