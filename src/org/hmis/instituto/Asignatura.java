package org.hmis.instituto;

import java.util.ArrayList;

public class Asignatura {
    private double nota;
    private ArrayList<Actividad> actividades;


    public Asignatura(double nota){
        this.nota = nota;
    }


    public double getNota() {
        return this.nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public ArrayList<Actividad> getActividades() {
        return this.actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }


    
}

