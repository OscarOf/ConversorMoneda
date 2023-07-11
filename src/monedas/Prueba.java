
package monedas;

public class Prueba {
    
    public static void main(String[] args){
        
        PesoColombiano a = new PesoColombiano();
        Dolar b = new Dolar(4.);
        Won w = new Won(1.);
                
        System.out.println("a es:"+ a.getNombre());
        System.out.println("total es: "+ b.convertir());
        System.out.println("Convertor es: "+ a.convertor(w, 4000.));
    }
}
