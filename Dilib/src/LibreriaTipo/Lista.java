package LibreriaTipo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 *
 * @author Alex Reinoso
 */
public class Lista<E> {
    
    private ArrayList<E> lista = new ArrayList<>();
    private List<E> elementoList;
    
    private boolean agregarElemento(int id, E valor){
        
        boolean band = false;
        if(valor instanceof Casa){
            lista.add(id, valor);
            band = true; 
        }else{
        System.out.println("Erro al ingresar datos");
    }
        return band;     
    }
    
    public E recuperarElemento(int id){
        E valor = null;
        valor =lista.get(id);
        if(valor == null){
            System.out.println("El elemento no se encuentra");
        }
        return valor;
    }
    
    public List<E> recuperarElmento(){
        elementoList=null;
        Iterator it = lista.iterator();
        while(it.hasNext()){
            Integer id = (Integer)it.next();
            elementoList.add(lista.get(id));
        }
        if(elementoList == null){
            System.out.println("Lista vacia");
        }
        return elementoList;
    }
    
    public boolean eliminarElemento(int id){
        boolean band = false;
        lista.remove(id);
        band = true;
        return band;
    }
    

    

}
