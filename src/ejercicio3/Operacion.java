package ejercicio3;

import java.util.Scanner;

public final class Operacion {

    public int[] arreglo = new int[10];
    public int opcion;
    String op;

    //CONSTRUCTOR.
    public Operacion() {
        this.mostrarMenu();
    }

    //MUESTRA MENÚ EN PANTALLA.
    public void mostrarMenu() {
        System.out.println("Escoja una opción: ");
        System.out.println("1- Llenar Arreglo.");
        System.out.println("2- Escribir Arreglo.");
        System.out.println("3- Sumatoria.");
        System.out.println("4- Productoria.");
        System.out.println("5- Tamaño del Array.");
        System.out.println("6- Salir.");
        //Captura de datos:
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();  //Leer un String.
        this.cargarOpcion(op);
    }

    //LEE ARREGLO.
    public void leerArreglo() {

    }

    //ESCRIBE EL ARREGLO.
    public void escribirArreglo() {
        System.out.println("Leyendo arreglo...");
        this.mostrarMenu();
    }

    //GENERA SUMATORIA. (Suma)
    public void sumatoria() {
        System.out.println("Sumando...");
        System.out.println("\n\n\");

    }

    //GENERA PRODUCTORIA. (Multiplicación)
    public void productoria() {
        System.out.println("\n\n\n\n\n");
        System.out.println("Sacando producto...");

    }

    //CARGAR OPCION.
    public void cargarOpcion(int op) {
        System.out.println("Opción escogida: " + op);
        switch (op) {
            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.escribirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4:
                this.sumatoria();

        }

    }
}
