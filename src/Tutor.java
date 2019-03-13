public class Tutor extends Profesor{
	Int cantidadDeAnyosTutorizado;

	public int trieniosDeTutorizacion(){
		int trienios;
		trienios = cantidadDeAnyosTutorizado/3;
		return trienios;
	}
}