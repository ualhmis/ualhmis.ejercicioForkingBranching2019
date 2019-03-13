public abstract class Equipamiento extends Aula(){
    public Number precio;
    
    public Equipamiento (Number precio){
        this.precio = precio;
    }
    public Number getPrecio(){
        return precio;
    }
    public void setPrecio(Number precio){
        this.precio = precio;
    }
}