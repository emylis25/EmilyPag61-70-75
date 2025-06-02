package ejerciciospag75;

import java.util.LinkedHashSet;

public class Librosprincipal {

        public static void main(String[] args) {
        LinkedHashSet<Libro> libro = new LinkedHashSet<>();

        libro.add(new Libro(1, "Cien Años de Soledad", "1ra", "Gabriel García Márquez"));
        libro.add(new Libro(2, "El Principito", "3ra", "Antoine de Saint-Exupéry"));
        libro.add(new Libro(3, "Don Quijote", "2da", "Miguel de Cervantes"));
        libro.add(new Libro(1, "Cien Años de Soledad", "1ra", "Gabriel García Márquez")); // Duplicado por ID, no se agregará

        System.out.println("Libros ingresados:");
        for (Libro l : libro) {
            l.mostrar();
        }
    }
}
