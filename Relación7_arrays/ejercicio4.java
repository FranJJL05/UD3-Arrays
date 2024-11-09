package Relación7_arrays;

//Crea un programa que reciba dos Arrays, y devuelva un Array con los valores máximos en cada una de
//las posiciones. Se debe tener en cuenta que los Arrays podrán ser de tamaños distintos.

public class ejercicio4 {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 5, 7};
        int[] array2 = {2, 3, 6};

        int[] maxValues = getMaxValues(array1, array2);

        System.out.println("Array de valores máximos:");
        for (int value : maxValues) {
            System.out.print(value + " ");
        }
    }

    public static int[] getMaxValues(int[] array1, int[] array2) {
        int maxLength = Math.max(array1.length, array2.length);
        int[] maxArray = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int value1 = (i < array1.length) ? array1[i] : Integer.MIN_VALUE;
            int value2 = (i < array2.length) ? array2[i] : Integer.MIN_VALUE;
            maxArray[i] = Math.max(value1, value2);
        }

        return maxArray;
    }
}


