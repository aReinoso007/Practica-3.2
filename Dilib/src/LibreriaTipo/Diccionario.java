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
public class Diccionario<T> 
{
    private HashMap<Integer,T> elemento=new HashMap<Integer,T>();
    private List<T> lista;

   
    public boolean agregaElemento(int K, T e)
    {
        boolean band=false;
        if(e instanceof String)
        {
            elemento.put(K, e);
            band=true;
        }
        else
        {
           System.out.println("Error de ingreso de datos"); 
        }
        
        return band;
    }
    
    public T recuperarElemento(int K)
    {
        T e=null;
       
        e=elemento.get(K);
        
        if(e==null)
        {
          System.out.println("El elemento a recuperar no se encuentra");  
        }
        
        return  e;
    }
    
    public List<T> recuperarElementos()
    {
        lista=null;
        
        Iterator it = elemento.keySet().iterator();
        
        while(it.hasNext())
        {
            Integer key = (Integer) it.next();
            lista.add(elemento.get(key));
        }
        
        if(lista==null)
        {
            System.out.println("La lista esta vacia");  
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
