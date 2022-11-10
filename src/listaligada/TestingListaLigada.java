package listaligada;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestingListaLigada {

    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        int dato;
        char respuesta;

        ListaLigada lista = new ListaLigada();

        for (;;) {
            System.out.println("Escribe un dato entero");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            lista.add(dato);
            System.out.println("Se ha agregado el dato a la lista");
            System.out.println("¿Quieres agregar mas datos? (s/n):");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            if (respuesta == 'n' || respuesta == 'N') {
                break;
            }
            System.out.println("-------------------");
            System.out.println("Contenido de la lista Ligada:");
            lista.printList();
        }

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("Escribe el dato entero: ");
        entrada = bufer.readLine();
        dato = Integer.parseInt(entrada);
        lista.add(dato);

        System.out.println("--------------------------");
        System.out.println("Contenido lista ligada");
        lista.printList();

        System.out.println("--------------------------");
        System.out.println("Inserción de un nuevo nodo");
        System.out.println("Escribe el elemento a inserta: ");
        entrada = bufer.readLine();
        int p = Integer.parseInt(entrada);
        lista.add(dato, p);

        System.out.println("---------------------------");
        System.out.println("Contenido de la lista");
        lista.printList();
        
    }
}
