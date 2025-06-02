import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1: Contar palabras en una frase
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Escribe una frase:");
         * String frase = entrada.nextLine();
         * 
         * int cantidadPalabras = frase.trim().split(" ").length;
         * System.out.println("La frase tiene " + cantidadPalabras + " palabras.");
         */

        // Ejercicio 2 : programa que lea una cadena y quite los espacios en blanco.
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Escribe una oración:");
         * String texto = entrada.nextLine();
         * 
         * String sinEspacios = texto.replace(" ", "");
         * System.out.println("Sin espacios: " + sinEspacios);
         */

        // Ejercicio 3: programa que lea una cadena, sustituya por mayúscula la primera
        // letra de la cadena y la primer letra después de un espacio.
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Escribe una frase:");
         * String frase = entrada.nextLine();
         * 
         * String nuevaFrase = "";
         * boolean mayuscula = true;
         * 
         * for (int i = 0; i < frase.length(); i++) {
         * char letra = frase.charAt(i);
         * 
         * if (mayuscula && letra != ' ') {
         * nuevaFrase += Character.toUpperCase(letra);
         * mayuscula = false;
         * } else {
         * nuevaFrase += letra;
         * }
         * 
         * if (letra == ' ') {
         * mayuscula = true;
         * }
         * }
         * System.out.println("Frase modificada: " + nuevaFrase);
         */

        // Ejercicio 4: programa que elimine la última palabra de una frase.
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Escribe una frase:");
         * String frase = entrada.nextLine();
         * 
         * int espacio = frase.lastIndexOf(" ");
         * 
         * if (espacio != -1) {
         * String nuevaFrase = frase.substring(0, espacio);
         * System.out.println("Frase sin la última palabra: " + nuevaFrase);
         * } else {
         * System.out.println("Solo hay una palabra.");
         * }
         */

        // Ejercicio 5: programa que muestre la cantidad de veces que aparece la vocal
        // “A” en una frase ingresada por la persona
        /*
         * Scanner entrada = new Scanner(System.in);
         * System.out.println("Escribe una frase:");
         * String frase = entrada.nextLine().toLowerCase();
         * 
         * int contador = 0;
         * 
         * for (int i = 0; i < frase.length(); i++) {
         * if (frase.charAt(i) == 'a') {
         * contador++;
         * }
         * }
         * System.out.println("La letra 'a' aparece " + contador + " veces.");
         */

        // Ejercicio 6: programa que muestre si la palabra ingresada por el usuario es
        // palíndroma o no.
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una palabra:");
        String palabra = entrada.nextLine();

        String alReves = "";

        for (int i = palabra.length() - 1; i >= 0; i--) {
            alReves += palabra.charAt(i);
        }

        if (palabra.equalsIgnoreCase(alReves)) {
            System.out.println("Es una palabra palíndroma.");
        } else {
            System.out.println("No es una palabra palíndroma.");
        }*/
    }
}