package Relación7arrays;

public class ejercicio9 {

  // Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y
  // que los almacene en
  // un array. El programa debe ser capaz de pasar todos los números pares a las
  // primeras posiciones del
  // array (del 0 en adelante) y todos los números impares a las celdas restantes.
  // Utiliza arrays auxiliares si
  // es necesario.

  public static void main(String[] args) {

    int[] num = new int[20];
    int[] par = new int[20];
    int[] impar = new int[20];
    int i;
    int pares = 0;
    int impares = 0;

    for (i = 0; i < 20; i++) {
      num[i] = (int) (Math.random() * 101);
      if (num[i] % 2 == 0) {
        par[pares++] = num[i];
      } else {
        impar[impares++] = num[i];
      }
    }

    System.out.println("Array original:");
    for (i = 0; i < 20; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();

    for (i = 0; i < pares; i++) {
      num[i] = par[i];

      for (i = pares; i < 20; i++) {
        num[i] = par[i - impares];
      }

      System.out.println("Array con los pares al principio:");
      for (i = 0; i < 20; i++) {
        System.out.print(num[i] + " ");
      }
    }
  }
}