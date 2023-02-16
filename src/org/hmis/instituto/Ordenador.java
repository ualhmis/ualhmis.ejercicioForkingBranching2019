package org.hmis.instituto;
import java.util.Objects;

public class Ordenador extends Equipamiento{
    private String sistemaOperativo;
    private String marca;


    public Ordenador() {
    }

    public Ordenador(String sistemaOperativo, String marca) {
        this.sistemaOperativo = sistemaOperativo;
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
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
            " sistemaOperativo='" + getSistemaOperativo() + "'" +
            ", marca='" + getMarca() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ordenador)) {
            return false;
        }
        Ordenador ordenador = (Ordenador) o;
        return Objects.equals(sistemaOperativo, ordenador.sistemaOperativo) && Objects.equals(marca, ordenador.marca);
    }



}