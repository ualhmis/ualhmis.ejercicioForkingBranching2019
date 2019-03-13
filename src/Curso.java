public class Curso{
    DateTime comienzoDeCurso;
    DateTime finDeCurso;
    String nombre; 
    Instituto insti;
    private ArrayList<Asignatura> asignaturas;
    Tutor tutorCurso;

    public curso(Instituto aux, Tutor tutor){
        this.comienzoDeCurso = new DateTime();
        this.finDeCurso = new DateTime();
        this.nombre = "";
        this.insti = aux;
        this.asignaturas = new ArrayList<Asignatura>();
        this.tutorCurso = tutor;
    }

    public double porcentajeCursoTerminado(){
        int totalAsignaturasSuperadas = 0;
        for(int i = 0; i < asignaturas.size(); i++){
            if(asignaturas.get(i) >=5){
                totalAsignaturasSuperadas++;
            }
        }

        double porcentaje = totalAsignaturasSuperadas/asignaturas.size();

        return porcentaje;
    }
}