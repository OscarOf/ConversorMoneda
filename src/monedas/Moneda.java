package monedas;

public abstract class Moneda {
    
    protected String nombre;
    protected Double precio;
    protected Double cantidad;

    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Double getCantidad(){
        return this.cantidad;
    }
    
    public void setCantidad(Double cantidad){
        this.cantidad = cantidad;
    }
    
    public Double convertir() {
        return this.cantidad / this.precio;
    }
   
}
