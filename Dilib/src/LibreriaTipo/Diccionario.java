/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaTipo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alex Reinoso
 */
public class Diccionario 
{
    private HashMap<Integer,Persona> elemento;
    private List<Persona> lista;

    public boolean agregaElemento(int K, Persona E)
    {
        boolean band=false;
        elemento.put(K, E);
        band=true;
        return band;
    }
    
    public Object recuperarElemento(int K)
    {
        Object k=elemento.get(K);
        
        return  k;
    }
    
    public List<Persona> recuperarElementos()
    {
        Iterator it = elemento.keySet().iterator();
        
        while(it.hasNext())
        {
            Integer key = (Integer) it.next();
            lista.add(elemento.get(key));
        }
        
        return lista;
    }
    
    public boolean eliminarElemento(int K)
    {
        boolean band=false;
        elemento.remove(K);
        band=true;
        
        return band;
    }
    
}
