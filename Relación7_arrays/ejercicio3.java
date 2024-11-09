package Relación7_arrays;

import java.util.Scanner;

//Crea un programa que reciba un Array de Strings y un char. Deberá mostrar todos los Strings cuya
//primera letra coincida con el char.

public class ejercicio3 {

    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    String[] palabras = { "manzana", "naranja", "mora", "plátano", "uvas", "melon", "mandarina" };

    System.out.print("Ingrese una letra: ");
    char letra = scanner.next().charAt(0);

    boolean encontrado = false;System.out.println("Palabras que comienzan con '"+ letra +"':");

    for (String palabra:palabras) {
            if (palabra.charAt(0) == letra) {
                System.out.println(palabra);
                encontrado = true;
            }
    }

    if(!encontrado)
    {
        System.out.println("No se encontraron palabras que comiencen con '" + letra + "'.");
    }

    scanner.close();
    }
}

