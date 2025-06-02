package ejerciciospag75;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();
        String opcion;

        do {
            System.out.print("Ingresa un número: ");
            int numero = entrada.nextInt();
            numeros.add(numero);

            System.out.print("¿Deseas ingresar otro número? (si/no): ");
            opcion = entrada.next();
        } while (opcion.equalsIgnoreCase("si"));

        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
