public class ArbolAVL {
    public NodoAVL raizPrincipal;

    // Altura de un nodo
    private int altura(NodoAVL nodo) {
        return nodo == null ? 0 : nodo.nivelAltura;
    }

    // Factor de balance
    private int balance(NodoAVL nodo) {
        return nodo == null ? 0 : altura(nodo.izq) - altura(nodo.der);
    }

    // Rotación simple a la derecha (LL)
    private NodoAVL rotacionDerecha(NodoAVL y) {
        NodoAVL x = y.izq;
        NodoAVL T2 = x.der;

        x.der = y;
        y.izq = T2;

        y.nivelAltura = Math.max(altura(y.izq), altura(y.der)) + 1;
        x.nivelAltura = Math.max(altura(x.izq), altura(x.der)) + 1;

        return x;
    }

    // Rotación simple a la izquierda (RR)
    private NodoAVL rotacionIzquierda(NodoAVL x) {
        NodoAVL y = x.der;
        NodoAVL T2 = y.izq;

        y.izq = x;
        x.der = T2;

        x.nivelAltura = Math.max(altura(x.izq), altura(x.der)) + 1;
        y.nivelAltura = Math.max(altura(y.izq), altura(y.der)) + 1;

        return y;
    }

    // Inserción con balanceo 

    public NodoAVL agregar(NodoAVL nodo, int valor) {
        if (nodo == null) return new NodoAVL(valor);

        if (valor < nodo.dato)
            nodo.izq = agregar(nodo.izq, valor);
        else if (valor > nodo.dato)
            nodo.der = agregar(nodo.der, valor);
        else
            return nodo; // No se permiten duplicados

        // Actualizar altura
        nodo.nivelAltura = 1 + Math.max(altura(nodo.izq), altura(nodo.der));
        int fb = balance(nodo);

		System.out.println();

        // Detectar desbalance y aplicar rotaciones
        if (fb > 1 && valor < nodo.izq.dato) {
            System.out.println("Desbalance en nodo: " + nodo.dato);
            System.out.println("Se aplica rotación RR (simple a la derecha)");
            return rotacionDerecha(nodo);
        }

        if (fb < -1 && valor > nodo.der.dato) {
            System.out.println("Desbalance en nodo: " + nodo.dato);
            System.out.println("Se aplica rotación LL (simple a la izquierda)");
            return rotacionIzquierda(nodo);
        }

        if (fb > 1 && valor > nodo.izq.dato) {
            System.out.println("Desbalance en nodo: " + nodo.dato);
            System.out.println("Se aplica rotación LR (doble: izquierda + derecha)");
            nodo.izq = rotacionIzquierda(nodo.izq);
            return rotacionDerecha(nodo);
        }

        if (fb < -1 && valor < nodo.der.dato) {
            System.out.println("Desbalance en nodo: " + nodo.dato);
            System.out.println("Se aplica rotación RL (doble: derecha + izquierda)");
            nodo.der = rotacionDerecha(nodo.der);
            return rotacionIzquierda(nodo);
        }

        return nodo;
    }

    // Impresión girada (opcional)
    public void mostrarArbol(NodoAVL nodo) {
        imprimirArbol(nodo, 0);
    }

    private void imprimirArbol(NodoAVL nodo, int nivel) {
        if (nodo == null) return;

        imprimirArbol(nodo.der, nivel + 1);
        System.out.println("    ".repeat(nivel) + nodo.dato);
        imprimirArbol(nodo.izq, nivel + 1);
    }
}



