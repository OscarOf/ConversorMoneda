package monedas;

public class PesoColombiano extends Moneda{

    public PesoColombiano() {
        super.nombre = "Peso Colombiano";        
    }

    public Double convertor(Moneda m, Double cantidad){
        return (cantidad*m.precio);
    }
}
