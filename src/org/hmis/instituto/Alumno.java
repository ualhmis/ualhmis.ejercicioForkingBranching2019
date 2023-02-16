package org.hmis.instituto;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String id;
    ArrayList<Asignatura> estudiaAsignaturas;

    public Alumno(String nombre, String apellidos, String dni, String email) {
        super(nombre, apellidos, dni, email);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Asignatura> getEstudiaAsignaturas() {
        return this.estudiaAsignaturas;
    }

    public void setEstudiaAsignaturas(ArrayList<Asignatura> estudiaAsignaturas) {
        this.estudiaAsignaturas = estudiaAsignaturas;
    }

    public void generarId(){
    
    }

    public void calcularPasaCurso(){

    }
    public int calcularNotaMedia(){
        return 0;
    }
}