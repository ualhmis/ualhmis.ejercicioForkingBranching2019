package org.hmis.instituto;
import java.util.ArrayList;
import java.util.Objects;

public class Instituto{
    private String nombre;
    private String direccion;
    private ArrayList<Curso> cursos;

    public Instituto(){
        this.nombre = "";
        this.direccion = "";
        this.cursos = new ArrayList<Curso>();
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Curso> getCursos() {
        return this.cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", cursos='" + getCursos() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Instituto)) {
            return false;
        }
        Instituto instituto = (Instituto) o;
        return Objects.equals(nombre, instituto.nombre) && Objects.equals(direccion, instituto.direccion) && Objects.equals(cursos, instituto.cursos);
    }

}