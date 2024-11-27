package Relación7arrays;
import java.util.*;

public class ejercicio6 {

    // Programa que lee por teclado la nota de los alumnos de una clase y calcula la
    // nota media del grupo.
    // También muestra los alumnos con notas superiores a la media. El número de
    // alumnos se lee por
    // teclado

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alumnos, i;
        double suma = 0, media;

        System.out.println("Introduce el numero de alumnos");
        alumnos = entrada.nextInt();

        double[] notas = new double[alumnos];

        for (i = 0; i < notas.length; i++) {
            System.out.println("Alumno" + (i + 1) + "Nota final: ");
            notas[i] = entrada.nextDouble();
        }

        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }

        media = suma / notas.length;

        System.out.printf("Nota media del curso: %.2f %n", media);

        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1) + " Nota final: " + notas[i]);
            }

        }
    }
}
