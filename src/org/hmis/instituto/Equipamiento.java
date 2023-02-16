package org.hmis.instituto;
public abstract class Equipamiento{
    private  double precio;
    private Aula aula;
    

    public Equipamiento() {
    }

    public Equipamiento (double precio){
        super();
        this.precio = precio;
    }

    public Equipamiento(double precio, Aula aula) {
        this.precio = precio;
        this.aula = aula;
    }

    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }


    public Aula getAula() {
        return this.aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }

}