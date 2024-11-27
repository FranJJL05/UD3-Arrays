package Relación7arrays;

//Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
//separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
//cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        int[] numero = new int[100];
        int i;
        Scanner entrada = new Scanner(System.in);

        // Generar 100 números aleatorios entre 0 y 20
        for (i = 0; i < 100; i++) {
            numero[i] = (int) (Math.random() * 21); // Genera números aleatorios entre 0 y 20
            System.out.print(numero[i] + "  "); // Mostrar números generados
        }

        System.out.println(); // Salto de línea después de mostrar todos los números

        // Pedir al usuario el primer y segundo valor
        System.out.println("Introduce el primer valor a cambiar:");
        int valor1 = entrada.nextInt();

        System.out.println("Introduce el segundo valor por el cual lo quieres cambiar:");
        int valor2 = entrada.nextInt();

        // Reemplazar todas las ocurrencias de valor1 por valor2 en el array
        for (i = 0; i < numero.length; i++) {
            if (numero[i] == valor1) {
                numero[i] = valor2; // Cambiar valor1 por valor2
            }
        }

        // Mostrar los números después de realizar el cambio
        System.out.println("Array después de realizar el cambio:");
        for (i = 0; i < 100; i++) {
            System.out.print(numero[i] + "  ");
        }

       
    }
}