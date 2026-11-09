package pilapersonal;

import java.util.Stack;

public class Pilapersonal {

    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();

        // TODO 1: Mete con push() tus 3 datos en este orden:
        //         número de lista, día de cumpleaños, mes de cumpleaños.
        //         Después de cada push, llama a imprimirPila(pila);
        int numeroLista = 15;
        int diaCumple = 12;
        int mesCumple = 5;

        pila.push(numeroLista);
        imprimirPila(pila);

        pila.push(diaCumple);
        imprimirPila(pila);

        pila.push(mesCumple);
        imprimirPila(pila);


        // TODO 2: Busca tu número de lista con search() e imprime la posición.
        int posicion = pila.search(numeroLista);
        System.out.println("El número de lista " + numeroLista + " está en la posición: " + posicion + "\n");


        // TODO 3: Vacía la pila de forma segura.
        //         Mientras NO esté vacía: saca con pop(), imprime "Se saco X"
        //         y llama a imprimirPila(pila);
        while (!pila.empty()) {
            int elementoSacado = pila.pop();
            System.out.println("Se saco " + elementoSacado);
            imprimirPila(pila);
        }

    }

    // Este método ya está completo: muestra la cima y el contenido
    private static void imprimirPila(Stack<Integer> pila) {
        if (pila.empty()) {
            System.out.println("La pila esta vacia\n");
        } else {
            System.out.println("Cima: " + pila.peek());
            System.out.println("Contenido: " + pila + "  <- la cima es el de la derecha\n");
        }
    }
}
