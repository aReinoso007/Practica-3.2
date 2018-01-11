/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibreriaTipo;
/**
 *
 * @author Estudiante
 */
public class Nodo <T> { 
    private T dato; 
    private Nodo siguiente; 
    private int indice=0; 

    public Nodo(){ 
        siguiente=null; 
        dato=null; 
    } 
    public Nodo(T dat,Nodo n,int ind){ 
        dato=dat; 
        siguiente=n; 
        indice=ind; 
    } 
    public void setSiguienteNodo(Nodo nodo){ 
        siguiente=nodo; 
    } 
    public void setDato(T dat){ 
        dato=dat; 
    } 
    public Nodo getSiguienteNodo(){ 
        return siguiente; 
    } 
    public Object getDato(){ 
        return dato; 
    } 
    public void setIndice(int i){ 
        indice=i; 
    } 
    public int getIndice(){ 
        return indice; 
    } 
     public String toString(){ 
        return ""+dato; 
    } 
}  