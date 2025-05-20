package Biblioteca;


public class Dispositivo {
    
    private String idDispositivo;
    private int precio;
    private Tipo tipoDispositivo;

    public Dispositivo(String idDispositivo, int precio, Tipo tipoDispositivo) {
        this.idDispositivo = idDispositivo;
        this.precio = precio;
        this.tipoDispositivo = tipoDispositivo;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "idDispositivo=" + idDispositivo + ", precio=" + precio + ", tipoDispositivo=" + tipoDispositivo + '}';
    }

    public Tipo getTipoDispositivo() {
        return tipoDispositivo;
    }

    public String getIdDispositivo() {
        return idDispositivo;
    }

    public boolean esTipo(Tipo tipo){
        return this.tipoDispositivo == tipo;
    }
    
    public boolean tieneId(String id){
        return this.idDispositivo.equals(id);
    }
}
