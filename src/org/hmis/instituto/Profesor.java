package org.hmis.instituto;
import java.sql.Date;
import java.util.ArrayList;

public class Profesor extends Persona{

    private  Date fechaDeContratacion;
    private  double dineroMes;
    private  ArrayList<Asignatura> imparteAsignaturas;

    public Profesor() {}
    
    public Profesor(ArrayList<Asignatura> imparteAsignaturas){
        this.imparteAsignaturas = imparteAsignaturas;
    }

    public Date getFechaDeContratacion() {
        return this.fechaDeContratacion;
    }

    public void setFechaDeContratacion(Date fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public double getDineroMes() {
        return this.dineroMes;
    }

    public void setDineroMes(double dineroMes) {
        this.dineroMes = dineroMes;
    }

    public ArrayList<Asignatura> getimparteAsignaturas() {
        return this.imparteAsignaturas;
    }


    public void setimparteAsignaturas(ArrayList<Asignatura> imparteAsignaturas){
        this.imparteAsignaturas = imparteAsignaturas;
    }

    public int antiguedad(){
        return 0;
    }

    public int dineroTotalGanado(){
        return 0;
    }

    public double calcularNotaMedia(){
        return 0;
    }


}