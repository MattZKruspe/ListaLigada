package listaligada;

/**
 * @author Matthew Marquez
 */
public class Nodo {

    //Variables
    private int dato; //Dato almacenado
    private Nodo siguiente; //Apuntador del siguiente nodo

    //Constructor
    public Nodo(int d) {
        this.dato = d;
        this.siguiente = null;
    }

    //Getters Y Setters
    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }

    
    
    
    
    
    
}
