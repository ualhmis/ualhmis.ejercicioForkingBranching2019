package org.hmis.instituto;
public class Tutor extends Profesor{
	private int anyosTutorizado;

	public Tutor() {
	}

	public Tutor(int anyosTutorizado) {
		this.anyosTutorizado = anyosTutorizado;
	}

	public int getAnyosTutorizado() {
		return this.anyosTutorizado;
	}

	public void setAnyosTutorizado(int anyosTutorizado) {
		this.anyosTutorizado = anyosTutorizado;
	}

	public int trieniosDeTutorizacion(){
		int trienios;
		trienios = anyosTutorizado/3;
		return trienios;
	}
}