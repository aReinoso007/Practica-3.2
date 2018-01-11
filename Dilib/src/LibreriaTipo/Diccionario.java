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
    
    public boolean agregaElemento(int K, T e)
    {
        boolean band=true;
        if(e instanceof String)
        {
            
            band=false;
        }
        
        if(e instanceof Integer)
        {
            
            band=false;
        }
        
        if(e instanceof Double)
        {
            
            band=false;
        }
        
        if(band==true)
        {
            elemento.put(K, e);
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
    
    public Object[] recuperarElementos()
    {
        Object[]lista=null;
        
       lista=elemento.values().toArray();
       
       if(lista==null)
       {
           System.out.println("La lista esta vacia");  
       }
        
        return lista;
    }
    
    public boolean eliminarElemento(int K)
    {
        boolean band;
        elemento.remove(K);
        band=true;
        
        return band;
    }
}
