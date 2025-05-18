// Clase que representa cada nodo del Árbol AVL

public class NodoAVL {
    int dato; // Valor almacenado en el nodo
    int nivelAltura; // Altura del nodo para cálculos de balance
    NodoAVL izq, der; // Referencias a los hijos izquierdo y derecho

    public NodoAVL(int valor) {
        this.dato = valor;
        this.nivelAltura = 1; // Al crear el nodo, su altura es 1
    }
}