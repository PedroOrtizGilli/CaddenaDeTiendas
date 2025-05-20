package Biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sucursal {
    
    private String nombre;
    private ArrayList<Dispositivo> dispositivos;

    public Sucursal(){
        this.dispositivos = new ArrayList<>();
    }
    
    public Sucursal(String nombre) {
        this();
        this.nombre = nombre;
    }
    
    
    private void checkNull(Dispositivo d){
        if(d == null){
            throw new NullPointerException("Objeto nulo");
        }
    }

    @Override
    public boolean equals(Object o){
        if (o == null || !(o instanceof Sucursal s)){
            return false;
        }
        return this.nombre.equals(s.nombre);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(nombre);
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public boolean tieneNombre(String nombre){
        return this.nombre.equals(nombre);
    }
    
    public void agregarDispositivo(Dispositivo d){
        checkNull(d);
        this.dispositivos.add(d);
    }   
    
    public void listarDispositivos(){
        if(this.dispositivos.isEmpty()){
            System.out.println("No hay dispositivos");
        }else{
            for (Dispositivo d : dispositivos){
                System.out.println(d);
            }
        }
    }
    
    public ArrayList<Dispositivo> dispositivosPorTipo(Tipo tipo){
        ArrayList<Dispositivo> listaPorTipo = new ArrayList<>();
        for(Dispositivo d : dispositivos){
            if (d.esTipo(tipo)){
                listaPorTipo.add(d);
            }
        }
        return listaPorTipo;
    }
    

    public int borrarDispositivo(String id){
        int eliminados = 0;
        Iterator<Dispositivo> it = dispositivos.iterator();
        while(it.hasNext()){
            if(it.next().tieneId(id)){
                it.remove();
                eliminados++;
            }
        }
        return eliminados;
    }

    /*
    public void borrarDispositivo(String id){
        Iterator<Dispositivo> it = dispositivos.iterator();
        while(it.hasNext()){
            Dispositivo d = it.next();
            if(id.equals(d.getIdDispositivo())){
                it.remove();
            }
        }
    }
    */
    
    public double[] porcDispositivosPorTipo(){
        
        int cantTipo = Tipo.values().length;
        int total = dispositivos.size();
        int[] cantidades = new int[cantTipo];
        double[] porcentajes = new double[Tipo.values().length];
        
        for(Dispositivo d : dispositivos){
            cantidades[d.getTipoDispositivo().ordinal()]++;
        }
        
        for(int i = 0; i < cantTipo; i++){
            porcentajes[i] = (double) cantidades[i] * 100 / total;
        }
        return porcentajes;
    }
}
