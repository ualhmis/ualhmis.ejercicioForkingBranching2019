package org.hmis.instituto;
import java.util.ArrayList;
import java.util.Date;

public class Curso{
    private Date comienzoDeCurso;
    private Date finDeCurso;
    private String nombre; 
    private Instituto insti;
    private ArrayList<Asignatura> asignaturas;
    private Tutor tutorCurso;

    public Curso(Instituto aux, Tutor tutor){
        this.comienzoDeCurso = new Date();
        this.finDeCurso = new Date();
        this.nombre = "";
        this.insti = aux;
        this.asignaturas = new ArrayList<Asignatura>();
        this.tutorCurso = tutor;
    }


    public Date getComienzoDeCurso() {
        return this.comienzoDeCurso;
    }

    public void setComienzoDeCurso(Date comienzoDeCurso) {
        this.comienzoDeCurso = comienzoDeCurso;
    }

    public Date getFinDeCurso() {
        return this.finDeCurso;
    }

    public void setFinDeCurso(Date finDeCurso) {
        this.finDeCurso = finDeCurso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Instituto getInsti() {
        return this.insti;
    }

    public void setInsti(Instituto insti) {
        this.insti = insti;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return this.asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Tutor getTutorCurso() {
        return this.tutorCurso;
    }

    public void setTutorCurso(Tutor tutorCurso) {
        this.tutorCurso = tutorCurso;
    }

    public double porcentajeCursoTerminado(){
        int totalAsignaturasSuperadas = 0;
        for(int i = 0; i < asignaturas.size(); i++){
            if(asignaturas.get(i).getNota() >=5){
                totalAsignaturasSuperadas++;
            }
        }

        double porcentaje = totalAsignaturasSuperadas/asignaturas.size();

        return porcentaje;
    }
}