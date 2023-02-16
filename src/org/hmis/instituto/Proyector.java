package org.hmis.instituto;
import java.util.Objects;

public class Proyector extends Equipamiento{
    private String marca;
    private int resolucionH;
    private 
    int resolucionV;


    public Proyector(String marca, int resolucionH, int resolucionV) {
        this.marca = marca;
        this.resolucionH = resolucionH;
        this.resolucionV = resolucionV;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getResolucionH() {
        return this.resolucionH;
    }

    public void setResolucionH(int resolucionH) {
        this.resolucionH = resolucionH;
    }

    public int getResolucionV() {
        return this.resolucionV;
    }

    public void setResolucionV(int resolucionV) {
        this.resolucionV = resolucionV;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", resolucionH='" + getResolucionH() + "'" +
            ", resolucionV='" + getResolucionV() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Proyector)) {
            return false;
        }
        Proyector proyector = (Proyector) o;
        return Objects.equals(marca, proyector.marca) && resolucionH == proyector.resolucionH && resolucionV == proyector.resolucionV;
    }



}