package Relación7arrays;

// Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de
//diferentes países. El array que contiene los nombres de los países es el siguiente: país = {“España”,
//  “Rusia”, “Japón”, “Australia”}. Los datos sobre las estaturas se deben simular mediante un array de 4
//filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. Los decimales de la
//media se pueden despreciar. Los nombres de los países se deben mostrar utilizando el array de países
//(no se pueden escribir directamente).

public class ejercicio13 {
  public static void main(String[] args) {

    String[] matrizpaises = { "España", "Rusia", "Japón", "Australia" };
    int[][] matriz = new int[4][10];
    int columna;

    for (int fila = 0; fila < matriz.length; fila++) {
      for (columna = 0; columna < matriz[fila].length; columna++) {
        matriz[fila][columna] = (int) (Math.random() * 70 + 140);
      }
    }

    for (int fila = 0; fila < matriz.length; fila++) {
      int suma = 0;
      int max = 0;
      int min = 300;
      System.out.print(matrizpaises[fila] + ": ");

      for (columna = 0; columna < matriz[fila].length; columna++) {
        System.out.print(matriz[fila][columna] + "|\t");
        suma += matriz[fila][columna];
        if (max < matriz[fila][columna]) {
          max = matriz[fila][columna];
        }
        if (min < matriz[fila][columna]) {
          min = matriz[fila][columna];
        }
      }
      System.out.print("Media:" + suma / 10 + "  Max:" + max + "  Min:" + min);
      System.out.println();

    }

  }
}
