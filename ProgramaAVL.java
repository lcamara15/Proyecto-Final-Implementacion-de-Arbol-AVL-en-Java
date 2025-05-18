import java.util.Scanner;

public class ProgramaAVL {
    public static void main(String[] args) {
        ArbolAVL arbolito = new ArbolAVL(); // Crear el árbol AVL
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean salir = false; 

        // Mensaje de bienvenida
        System.out.println("========================================== ");
        System.out.println("¡Bienvenido (a) al Árbol AVL Interactivo!"); 
        System.out.println("==========================================");
        System.out.println();

        // Arbolito decorativo
        System.out.println("              *         ");
        System.out.println("             ***        ");
        System.out.println("            *****       ");
        System.out.println("           *******      ");
        System.out.println("          *********     ");
        System.out.println("             |||        ");
        System.out.println();

        // Título ASCII: Menu
        System.out.println("   __  __ _____ _   _ _   _ ");
        System.out.println("  |  \\/  | ____| \\ | | | | |");
        System.out.println("  | |\\/| |  _| |  \\| | | | |");
        System.out.println("  | |  | | |___| |\\  | |_| |");
        System.out.println("  |_|  |_|_____|_| \\_|\\___/ ");
        System.out.println();

        do {
            // Opciones del menú
            System.out.println("\n¿Qué deseas hacer?");
            System.out.println();
            System.out.println("1. Insertar un número en el árbol");
            System.out.println("2. Ver el árbol actual");
            System.out.println("3. Reiniciar y comenzar con un nuevo árbol");
            System.out.println("4. Salir del programa");
            System.out.println();
            System.out.print("Selecciona una opción (1/2/3/4 o 'exit' / -1 para salir): ");
            opcion = teclado.nextLine().trim().toLowerCase();

            switch (opcion) {
                case "1":
                    // Insertar un número
                    System.out.print("Ingresa un número entero (o 'exit' / -1 para salir): ");
                    String entrada = teclado.nextLine().trim().toLowerCase();

                    // Si el usuario quiere salir desde aquí
                    if (entrada.equals("exit") || entrada.equals("-1")) {
                        salir = true;
                        break;
                    }

                    try {
                        int numero = Integer.parseInt(entrada);
                        arbolito.raizPrincipal = arbolito.agregar(arbolito.raizPrincipal, numero);
                        System.out.println("\n¡Número insertado correctamente!\n");
                        VistaAVL.printTree(arbolito.raizPrincipal); 
                    } catch (NumberFormatException e) {
                        System.out.println("\nEse no es un número válido.");
                    }
                    break;

                case "2":
                    // Mostrar árbol AVL actual
                    System.out.println("\n  Vista del árbol AVL:");
                    System.out.println("-----------------------------");
                    VistaAVL.printTree(arbolito.raizPrincipal);
                    System.out.println("-----------------------------");
                    break;

                case "3":
                    // Reiniciar el árbol
                    arbolito = new ArbolAVL();
                    System.out.println("\n¡El árbol ha sido reiniciado!");
                    System.out.println("Puedes continuar insertando números en tu nuevo árbol.");
                    break;

                case "4":
                case "exit":
                case "-1":
                    // Salida del programa
                    System.out.println("\n¡Muchas gracias por jugar con el árbol AVL! Nos vemos pronto.");
                    salir = true;
                    break;

                default:
                    // Opción inválida
                    System.out.println("\nOpción inválida. Intenta nuevamente.");
                    break;
            }

        } while (!salir); // Se repite mientras no se pida salir

        teclado.close(); // Cerrar el escáner
    }
}



