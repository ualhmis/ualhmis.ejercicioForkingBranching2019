package org.hmis.instituto;

import java.util.Objects;

public class Silla extends Equipamiento{
    private String marca;

    public Silla() {
    }

    public Silla(String marca, double precio) {
        super(precio);
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Silla)) {
            return false;
        }
        Silla silla = (Silla) o;
        return Objects.equals(marca, silla.marca) && Objects.equals(getPrecio(), silla.getPrecio());
    }


}
