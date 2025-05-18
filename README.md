# Proyecto-Final-Implementacion-de-Arbol-AVL-en-Java

Este proyecto consiste en una aplicación interactiva por consola desarrollada en Java que implementa un árbol AVL auto-balanceado. A través de un menú intuitivo, el usuario puede insertar números, visualizar gráficamente la estructura del árbol en forma jerárquica, reiniciarlo o finalizar el programa. El árbol se ajusta automáticamente mediante rotaciones cuando se detecta un desbalance, e informa claramente en qué nodo ocurrió y qué tipo de rotación fue aplicada.


El programa ha sido diseñado para cumplir con los siguientes objetivos:

- Permitir la inserción de valores enteros uno por uno.
- Mostrar en pantalla, de forma jerárquica y visual, la estructura del árbol.
- Detectar y aplicar automáticamente rotaciones para mantener el equilibrio del árbol.
- Indicar qué tipo de rotación se aplicó y en qué nodo ocurrió el desbalance.
- Brindar la opción de reiniciar completamente el árbol AVL.
- Finalizar la ejecución escribiendo 'exit', el valor '-1', o seleccionando la opción correspondiente en el menú.

Además, el método 'printTree(Node raiz)' ha sido implementado como requisito obligatorio para representar gráficamente el árbol directamente en consola. Este método imprime cada nivel del árbol y utiliza los símbolos '/' y '\' para representar visualmente las ramas entre padres e hijos, simulando así una estructura jerárquica comprensible y alineada.

---

# Capturas de pantalla

A continuación se presenta un ejemplo de ejecución donde el usuario interactúa con el árbol:

![image](https://github.com/user-attachments/assets/c233417d-2496-4031-ad9e-6aa7f2cc2616)
![image](https://github.com/user-attachments/assets/de802b09-00e9-446c-8563-a90854a969af)
![image](https://github.com/user-attachments/assets/c567a943-beb9-43f0-8342-efa52808ee50)
![image](https://github.com/user-attachments/assets/4335d98e-7734-4d15-be18-4a8b1875b21d)


# Instrucciones para ejecutar el programa y archivos necesarios

1. Abrir el entorno de desarrollo Java preferido, como Visual Studio Code, IntelliJ IDEA o NetBeans.
2. Asegurarse de tener todos los archivos necesarios en el mismo proyecto:

   - ProgramaAVL.java
   - ArbolAVL.java
   - NodoAVL.java
   - VistaAVL.java 

3. Compilar el proyecto. Esto puede hacerse desde el entorno o con el comando javac *.java si se está utilizando la consola.
4. Ejecutar la clase principal ProgramaAVL, que iniciará el menú interactivo en consola.
5. Seguir las instrucciones en pantalla para insertar números, visualizar el árbol, reiniciar el proceso o salir del programa. En cualquier momento, se puede finalizar la ejecución escribiendo la palabra exit, el valor -1, o seleccionando la opción 4 del menú principal.

# Opciones del menú

1. Insertar un número en el árbol
2. Ver el árbol actual
3. Reiniciar y comenzar con un nuevo árbol
4. Salir del programa

# Funcionalidades destacadas

✔ Inserción dinámica de nodos en el árbol.

✔ Balanceo automático mediante rotaciones LL, RR, LR y RL.

✔ Detección e impresión de desbalances y tipos de rotación aplicados.

✔ Representación gráfica jerárquica con el método printTree(...).

✔ Reinicio de árbol AVL sin tener que reiniciar el programa.

✔ Finalización del sistema flexible (exit, -1 o selección de la opción 4).

# Enlace de vídeo de Youtube

