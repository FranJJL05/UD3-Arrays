package Relación7arrays;

import java.util.Scanner;

public class ejercicio5 {

    // Calcular la media de una serie de números que se leen por teclado. Leer por
    // teclado 10 números
    // enteros y guardarlos en un array. A continuación calcula y muestra por
    // separado la media de los
    // valores positivos y la de los valores negativos.

    public static void main(String args[]) {

        int[] numeros = new int[10];
        int i;
        int pos = 0, neg = 0;
        double sumaPos = 0, sumaNeg = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.println("numeros[" + i + "]= ");
            numeros[i] = entrada.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                neg++;
            }
        }

        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido numeros positivos");
        }

        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido numeros negativos");
        }

    }
}
