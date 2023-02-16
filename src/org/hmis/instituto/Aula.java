package org.hmis.instituto;

import java.util.ArrayList;

public class Aula{
	private double capacidadMaxima;
	ArrayList<Equipamiento> equipamientos;

	public Aula(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCapacidadMaxima() {
		return this.capacidadMaxima;
	}

	public void setCapacidadMaxima(double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public int calcularLibres(){
		return 0;
	}
}
