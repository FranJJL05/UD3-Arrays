package Relación7arrays;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] array1 = new int[20];

        // Llenar el array con números aleatorios entre 0 y 400 (inclusive)
        for (int i = 0; i < 20; i++) {
            array1[i] = (int) (Math.random() * 401); // Para incluir 400, multiplicamos por 401
        }

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println(); // Salto de línea

        // Solicitar al usuario si quiere resaltar múltiplos de 5 o múltiplos de 7
        System.out.println("Elige una opción para resaltar:");
        System.out.println("1. Múltiplos de 5");
        System.out.println("2. Múltiplos de 7");

        int opcion = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer del scanner

        // Validar la entrada
        if (opcion == 1) {
            System.out.println("Array con múltiplos de 5 resaltados:");
            for (int i = 0; i < 20; i++) {
                if (array1[i] % 5 == 0) {
                    System.out.print("[" + array1[i] + "]" + " ");
                } else {
                    System.out.print(array1[i] + " ");
                }
            }
        } else if (opcion == 2) {
            System.out.println("Array con múltiplos de 7 resaltados:");
            for (int i = 0; i < 20; i++) {
                if (array1[i] % 7 == 0) {
                    System.out.print("[" + array1[i] + "]" + " ");
                } else {
                    System.out.print(array1[i] + " ");
                }
            }
        } else {
            System.out.println("Opción no válida.");
        }

        entrada.close();
    }
}
