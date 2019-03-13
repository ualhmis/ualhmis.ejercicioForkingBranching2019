public class Profesor extends Persona {

    public DateTime fechaDeContratacion;
    public double dineroMes;
    public ArrayList<Asignatura> listAsignaturas;

    public Profesor() {}
    public Profesor(ArrayList<Asignatura> listAsignaturas){
        this.listAsignaturas = listAsignaturas;
    }

    public void setListAsignaturas(ArrayList<Asignatura> listAsignaturas){
        this.listAsignaturas = listAsignaturas;
    }

    public int antiguedad(){
    }

    public int dineroTotalGanado(){
    }

    public double calcularNotaMedia(){
    }


}