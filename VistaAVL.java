import java.util.*;

public class VistaAVL {

    // Método principal que dibuja el árbol AVL en consola

    public static void printTree(NodoAVL raiz) {
        if (raiz == null) {
            System.out.println("(árbol vacío)");
            return;
        }

        // Calcular la altura total del árbol
        int altura = obtenerAltura(raiz);

        // Lista para recorrer nivel por nivel, empezando por la raíz
        List<NodoAVL> nivelActual = new ArrayList<>();
        nivelActual.add(raiz);

        // Recorremos cada nivel del árbol
        for (int nivel = 0; nivel < altura; nivel++) {

            // Lista para almacenar los nodos del siguiente nivel
            List<NodoAVL> siguienteNivel = new ArrayList<>();

            StringBuilder lineaNodos = new StringBuilder();
            StringBuilder lineaRamas = new StringBuilder();

            // Cálculo del espaciado inicial y entre nodos en este nivel
            int espacioInicial = (int) Math.pow(2, altura - nivel - 1) - 1;
            int espacioEntre = (int) Math.pow(2, altura - nivel) - 1;

            String espacio = " ".repeat(3);  // Espacio base por nodo (3 espacios)

            // Agrega espacios iniciales antes de imprimir nodos
            lineaNodos.append(" ".repeat(espacioInicial * espacio.length()));
            lineaRamas.append(" ".repeat(espacioInicial * espacio.length()));

            // Recorre todos los nodos del nivel actual
            for (NodoAVL nodo : nivelActual) {
                if (nodo == null) {
                    // Si el nodo es nulo, se imprime espacio en blanco
                    lineaNodos.append("   "); // nodo vacío
                    siguienteNivel.add(null);
                    siguienteNivel.add(null);
                    lineaRamas.append("   "); // sin ramas
                } else {
                    // Imprime el dato del nodo con dos espacios de ancho
                    String dato = String.format("%2s", nodo.dato);
                    lineaNodos.append(dato).append(" ");

                    // Agrega los hijos al siguiente nivel
                    siguienteNivel.add(nodo.izq);
                    siguienteNivel.add(nodo.der);

                    // Dibujar ramas hacia los hijos si existen
                    if (nodo.izq != null) {
                        lineaRamas.append("/ ");
                    } else {
                        lineaRamas.append("  ");
                    }

                    if (nodo.der != null) {
                        lineaRamas.append("\\ ");
                    } else {
                        lineaRamas.append("  ");
                    }
                }

                // Agrega espacios entre nodos del mismo nivel
                lineaNodos.append(" ".repeat(espacioEntre * espacio.length()));
                lineaRamas.append(" ".repeat((espacioEntre - 1) * espacio.length()));
            }

            // Imprimie la línea con los valores de los nodos
            System.out.println(lineaNodos.toString().stripTrailing());

            // Imprime la línea con las ramas solo si no es el último nivel
            if (nivel != altura - 1) {
                System.out.println(lineaRamas.toString().stripTrailing());
            }

            // Avanzamos al siguiente nivel
            nivelActual = siguienteNivel;
        }
    }

    // Método auxiliar para obtener la altura de un nodo de forma recursiva

    private static int obtenerAltura(NodoAVL nodo) {
        if (nodo == null) return 0;
        return 1 + Math.max(obtenerAltura(nodo.izq), obtenerAltura(nodo.der));
    }
}





