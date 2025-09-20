package latinasincloud;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int valor_numerico;
        do {
            System.out.println("----------Calculadora básica----------");
            System.out.println("[1] Sumar");
            System.out.println("[2] Restar");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[5] Elevar (Potencia)");
            System.out.println("[6] Salir");
            System.out.print("Ingresa la operación que te gustaría realizar: ");

            while(true) {
                String valor = scanner.next();
                try {
                    valor_numerico = Integer.parseInt(valor);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("El valor ingresado debe ser un número. Intente nuevamente.");
                }
            }

            //-------------------------------------------------------
            // Ejecutar cada acción utilizando las funciones creadas.
            //-------------------------------------------------------

        }while(valor_numerico != 6);
        System.out.println("¡Gracias por usar la calculadora!");

    }

    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    }
    public static double multiplicacion(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
    public static double potencia(double a, double b){
        return Math.pow(a,b);
    }
}