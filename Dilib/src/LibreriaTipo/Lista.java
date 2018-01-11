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
public class Lista<T> {

    Nodo raiz;
    int indice;

    public Lista() {
        raiz = null;
        indice = 0;
    }

    //comprobar si la raiz esta vacia 
    private boolean raizVacia() {
        return raiz == null;
    }

    //comprobar si el objeto ya ha sido ingresado 
    private boolean objetoYaIngresado(T obj) {
        boolean objetoya = false;
        int i = 1;
        Nodo aux = raiz;
        for (int j = 0; j < indice && aux != null; j++) {
            if (!aux.getDato().equals(obj)) {
                i++;
            }
            aux = aux.getSiguienteNodo();
        }
        if (i <= indice) {
            objetoya = true;
        } else {
            objetoya = false;
        }
        return objetoya;
    }

    //Mostar la Cantidad de elementos ingresados 
    public int tamañoLista() {
        return indice;
    }

//METODO PARa INGRESAR OBJETOS 
    public void ingresar(T dato) {
        //si cabecera es null ingreso el primer objeto 

        if (raizVacia()) {
            raiz = new Nodo(dato, raiz, indice);
            indice++;
        } else {
            if (objetoYaIngresado(dato) == false) {
                Nodo aux = raiz;
                //con el while recorro cada nodo verificando cual es ultimo 
                while (aux.getSiguienteNodo() != null) //una vez estando en el puntero indicado la guardo 
                {
                    aux = aux.getSiguienteNodo();
                }
                //creo un nodo temporal para para ingresr un nuevo objeto y luego guardarlo en la puntero encontrado 
                Nodo aux2 = new Nodo(dato, aux.getSiguienteNodo(), indice);
                aux.setSiguienteNodo(aux2);
                indice++;
            }
        }
    }

    //funcion para eliminar ultimo objeto de la lista 
    public Object eliminaUltimObjeto() {
        if (this.raizVacia()) {
            return null;
        }
        if (raiz.getSiguienteNodo() == null) {
            Nodo aux2 = raiz;
            raiz = aux2.getSiguienteNodo();
            indice--;
            return aux2.getDato();
        }
        Nodo aux = raiz;
        while (aux.getSiguienteNodo().getSiguienteNodo() != null) {
            aux = aux.getSiguienteNodo();
        }
        Object obj = aux.getSiguienteNodo().getDato();
        aux.setSiguienteNodo(aux.getSiguienteNodo().getSiguienteNodo());
        indice--;

        return obj;
    }
     public void Eliminar(T dato)
    {
       if(raiz!=null)
       {
           if(raiz.getDato()==dato)
           {
               raiz=raiz.getSiguienteNodo();
           }else
           {
               Nodo aux =raiz;
               while(aux.getSiguienteNodo()!=null && aux.getSiguienteNodo().getDato() != dato)
               {
                   aux = aux.getSiguienteNodo();              
               }
               try
               {
                   aux.setSiguienteNodo(aux.getSiguienteNodo().getSiguienteNodo());
               }catch(Exception e){
                   System.out.println("No se encuentra en la lista");
               }
               
              
           }
       } 
        
    }

    public void VerLista() {
        Nodo aux = raiz;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguienteNodo();
        }
      
    }
}
