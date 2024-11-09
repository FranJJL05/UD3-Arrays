package Relación7_arrays;

//Crea un programa que reciba un Array de Strings y muestre el String más largo

public class ejercicio2 {
    public static void main(String[] args) {
        String[] array = { "Hola", "mundo", "ejercicio", "cuatro" };

        String mayor = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > mayor.length()) {
                mayor = array[i];

            }
        }

        System.out.println("La palabra con más letras es:" + mayor);
        
    }
}
