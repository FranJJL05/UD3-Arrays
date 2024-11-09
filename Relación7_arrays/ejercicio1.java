package Relación7_arrays;

import java.util.Scanner;

//Crea un programa que dado un Array de enteros y un valor entero, muestre la cantidad de veces que
//aparece el entero en el Array

public class ejercicio1 {
    public static void main(String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int[] array = {2,3,4,3,2,2};
        int numeroBuscado;

        System.out.print("Ingrese el número entero a contar: ");
        numeroBuscado = entrada.nextInt();

        int contador = 0;
        for (int num : array) {
            if (num == numeroBuscado) {
                contador++;
            }
        }

        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el array.");
        entrada.close();
    }
}
