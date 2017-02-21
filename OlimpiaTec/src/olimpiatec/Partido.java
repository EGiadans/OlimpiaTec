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
public class Partido {
    private int numeroP;
    private String horario;
    private Equipo equipo1;
    private Equipo equipo2;

    public Partido(int numeroP, String horario, Equipo equipo1, Equipo equipo2) {
        this.numeroP = numeroP;
        this.horario = horario;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public int getNumeroP() {
        return numeroP;
    }

    public void setNumeroP(int numeroP) {
        this.numeroP = numeroP;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }
    
    @Override
    public String toString(){
        return "Partido \n"+getNumeroP()+"["+this.equipo1.getNombreEq()+" vs "+
                this.equipo2.getNombreEq()+"]"+ "\n Horario: "+getHorario();
                
    }
}
