package org.hmis.instituto;
public class Mesa extends Equipamiento {
    private int capacidad;

    public Mesa (int capacidad){
        this.capacidad = capacidad;
    }
    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad (int capacidad){
        this.capacidad = capacidad;
    }
}