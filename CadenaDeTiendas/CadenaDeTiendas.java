package CadenaDeTiendas;

import Biblioteca.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class CadenaDeTiendas {

    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(3,2,4,5,3,5,6,3,7));
        
        /*
        // numeros.remove((Integer)3);
        //Recorro en orden inverso
        for (int i = numeros.size(); i >= 0; i--){
            if(numeros.get(i) == 3){
                numeros.remove(i);
            }
        }
        
        // Otra solucion, recorriendo con una copia
        ArrayList<Integer> copia = (ArrayList<Integer>) numeros.clone();
        
        for (int i = 0; i < copia.size(); i++){
            if(copia.get(i) == 3){
                numeros.remove((Integer)3);
            }
        }
        
        //Otra slucion
        ArrayList<Integer> copia2 = (ArrayList<Integer>) numeros.clone();
        
        for(Integer i : copia2){
            if(i == 3){
                numeros.remove((Integer)3);
            }
        }
        
        //"La forma correcta"
        Iterator<Integer> it = numeros.iterator();
        
        System.out.println(numeros);
        
        while(it.hasNext()){
            if (it.next() == 3){
                it.remove();
            }
        }
        System.out.println("--------------");
        System.out.println(numeros);
        */
        
        Empresa empresa = new Empresa();
        
        hardcodearEmpresa(empresa);
        
        //Punto A
        empresa.listarDispositivos();
        
        //Punto B
        ArrayList<Dispositivo> dispos = new ArrayList<>(empresa.dispositivosPorTipo(Tipo.TABLET));
        
        for(Dispositivo d : dispos){
            System.out.println(d);
        }
        
        System.out.println("---------------------------------");
        
        empresa.borrarDispositivod("asfdsfd");
        empresa.listarDispositivos();
    }
    
    public static void hardcodearEmpresa(Empresa e){
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        e.agregarSucursal(s1);
        e.agregarSucursal(s2);
        
        System.out.println("--------------");
        
        s1.agregarDispositivo(new Dispositivo("asfdsfd", 1200, Tipo.COMPUTADORA));
        s1.agregarDispositivo(new Dispositivo("gtregdsf", 900, Tipo.TABLET));
        s1.agregarDispositivo(new Dispositivo("sdfghb", 500, Tipo.COMPUTADORA));
        s1.agregarDispositivo(new Dispositivo("asfdsfd", 700, Tipo.TELEFONO));
        
        s2.agregarDispositivo(new Dispositivo("fdghj76", 700, Tipo.TELEFONO));
        s2.agregarDispositivo(new Dispositivo("34g6uexd", 700, Tipo.COMPUTADORA));
        s2.agregarDispositivo(new Dispositivo("587udfg3", 700, Tipo.TABLET));
        s2.agregarDispositivo(new Dispositivo("587udfg3", 700, Tipo.TABLET));
        s1.agregarDispositivo(new Dispositivo("587udfg3", 700, Tipo.TABLET));
        
    }
    
}
