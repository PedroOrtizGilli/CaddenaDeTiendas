package Biblioteca;

import java.util.ArrayList;

public class Empresa {
    
    private ArrayList<Sucursal> sucursales = new ArrayList<>();

    
    private void checkSucursal(Sucursal s){
        if(s == null){
            throw new NullPointerException("Objeto nulo");
        }
        if(sucursales.contains(s)){
            throw new SucursalRepetidaException();
        }
    }
    
    public void agregarSucursal(Sucursal s){
        checkSucursal(s);
        this.sucursales.add(s);
    }
    
    
    public void listarDispositivos(){
        if(sucursales.isEmpty()){
            System.out.println("No hay sucursales");
        } else{
            for(Sucursal s : sucursales){
                s.listarDispositivos();
        }
        }
    }
    
    public ArrayList<Dispositivo> dispositivosPorTipo(Tipo tipo){
        ArrayList<Dispositivo> retorno = new ArrayList<>();
        for(Sucursal s : sucursales){
            retorno.addAll(s.dispositivosPorTipo(tipo));
        }
        return retorno;
    }
    /*
    public void borrarDispositivo(String id){
        for(Sucursal s : sucursales){
            s.borrarDispositivo(id);
        }
    }
    */
    
    public int borrarDispositivod(String id){
        int total = 0;
        for(Sucursal s : sucursales){
            total += s.borrarDispositivo(id);
        }
        return total;
    }
    
    public double[] porcDispositivosPorTipo(String nombreSucursal){
        for(Sucursal s : sucursales){
            if(s.tieneNombre(nombreSucursal)){
                return s.porcDispositivosPorTipo();
            }
        }
        return null;
    }
}
