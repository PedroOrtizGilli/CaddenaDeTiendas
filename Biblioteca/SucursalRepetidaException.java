package Biblioteca;

public class SucursalRepetidaException extends RuntimeException {
    
    private static final String MENSAJE = "Sucursal repetida";
    
    public SucursalRepetidaException(){
        this(MENSAJE);
    }
    
    public SucursalRepetidaException(String mensaje){
        super(mensaje);
    }
}
