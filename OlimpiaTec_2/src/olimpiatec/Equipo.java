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
public class Equipo {   //Attributes 
    private String deporte;
    private String nombreEq;
    private ArrayList <Integrante> integrantes ;
    //Constructor
    public Equipo(String deporte, String nombreEq, ArrayList<Integrante> integrantes) {
        this.deporte = deporte;
        this.nombreEq = nombreEq;
        this.integrantes = integrantes;
    }
    //Getters and Setters
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
    public boolean addIntegrante(String nombre, int numero){   //This method allow us 
        if (findIntegrante(nombre)==false){                 //to addd a mmeber to the 
            this.integrantes.add(new Integrante(nombre,numero)); //array list of members
            return true;                                    // in a team
        }else{
            return false;
        }
    }
    public boolean addIntegrante(Integrante integrante){ //Same method with diferent
        if (findIntegrante(integrante.getNombre())==false){ //parameters
            this.integrantes.add(integrante);
            return true;
        }else{
            return false;
        }
    }
    public boolean removeIntegrante(Integrante integrante){ //Is used for the removal
        if (findIntegrante(integrante.getNombre())==true){ //of the whole member given
            this.integrantes.remove(integrante);            //from the arrayList
            return true;
        }else{
            return false;
        }
    }
    public boolean removeIntegrante(String nombre, int numero){ //Same method,
        if (findIntegrante(nombre)==true){                      //different parameters
            this.integrantes.remove(new Integrante(nombre,numero));
            return true;
        }else{
            return false;
        }
    }
    private boolean findIntegrante(String nombre){ //Method for making easier the
        if (!this.integrantes.isEmpty()){       //process of adding and removing
            for (Integrante integrante: integrantes){   //members of a team
                if (integrante.getNombre().equals(nombre)){
                    return true;
                }
            }
        }
        return false;
    }
    @Override 
    public String toString(){ //Method for obtaining a String with the details
        String temp;        //of a team including details of its members
        temp= "Equipo: "+this.nombreEq+"\n Deporte: "+this.deporte;
        
        for (Integrante integrante: integrantes){
            temp+="Integrante["+integrante.toString();//getNombre()+", Numero: "+
                    //integrante.getNumero();
        }
        return temp;        
    }
}
