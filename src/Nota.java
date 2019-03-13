public class Nota{
    private String nombreTarea;
    private tipoTarea tipo;
    private double valorNumerico;

    public String calcularGradoNota(){
        if(valorNumerico < 5){
            return "Suspenso";
        } else if(valorNumerico >= 5 && valorNumerico < 6){
            return "Suficiente";
        } else if(valorNumerico >= 6 && valorNumerico < 7){
            return "Bien";
        } else if(valorNumerico >= 7 && valorNumerico < 9){
            return "Notable";
        }
        return "Sobresaliente";
    }
}