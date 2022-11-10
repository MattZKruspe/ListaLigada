package listaligada;
/**
 * @author Matthew Marquez
 */
public class Nodo <T> {

    //Variables
    private  T dato; //Dato almacenado
    private Nodo siguiente; //Apuntador del siguiente nodo

    //Constructor
    public Nodo(T d) {
        this.dato = d;
        this.siguiente = null;
    }

    //Getters Y Setters
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo otroNodo) {
        this.siguiente = otroNodo;
    }

}
