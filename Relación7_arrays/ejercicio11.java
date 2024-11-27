package Relación7arrays;

//Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores
//según la siguiente tabla. Muestra el contenido de todos los elementos del array dispuestos en forma
//de tabla como se muestra en la figura.

public class ejercicio11 {

    public static void main(String[] args) {

        int[][] num = { { 0, 30, 2, 0, 0, 5 }, { 75, 0, 0, 0, 0, 0 }, { 0, 0, -2, 9, 0, 11 } };
        System.out.println("       Colunma 0" + "     Columna1" + "      Columna2" + "       Columna3"
                + "      Colunma 4" + "     Columna5");
        for (int fila = 0; fila < num.length; fila++) {
            System.out.print("Fila" + fila + "     ");
            for (int columna = 0; columna < num[fila].length; columna++) {
                System.out.print(num[fila][columna] + "             ");
            }
            System.out.println();
        }

    }
}
