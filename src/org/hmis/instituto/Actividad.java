package org.hmis.instituto;
import java.util.Objects;

public class Actividad{
    private String nombre;
    private TipoTarea tipo;
    private double valorNumerico;

    public Actividad() {
    }

    public Actividad(String nombre, TipoTarea tipo, double valorNumerico) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valorNumerico = valorNumerico;
    }

    public String getnombre() {
        return this.nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoTarea getTipo() {
        return this.tipo;
    }

    public void setTipo(TipoTarea tipo) {
        this.tipo = tipo;
    }

    public double getValorNumerico() {
        return this.valorNumerico;
    }

    public void setValorNumerico(double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getnombre() + "'" +
            ", tipo='" + getTipo() + "'" +
            ", valorNumerico='" + getValorNumerico() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Actividad)) {
            return false;
        }
        Actividad nota = (Actividad) o;
        return Objects.equals(nombre, nota.nombre) && Objects.equals(tipo, nota.tipo) && valorNumerico == nota.valorNumerico;
    }



    public String calcularGradoNota(){
        if(valorNumerico < 5){
            return "Suspenso";
        } else if(valorNumerico >= 5 && valorNumerico < 6){
            return "Suficiente";
        } else if(valorNumerico >= 6 && valorNumerico < 7){
            return "Bien";
        } else if(valorNumerico >= 7 && valorNumerico < 9){
            return "Notable";
        }
        return "Sobresaliente";
    }
}