package Ejerciciospag70;

import java.util.ArrayList;

public class ListaAlumno {
    public static void main(String[] args) {
        ArrayList<Alumno> lista = new ArrayList<>();

        lista.add(new Alumno("001", "Emily", "C123"));
        lista.add(new Alumno("002", "Carlos", "C456"));
        lista.add(new Alumno("003", "Ana", "C789"));

        for (Alumno a : lista) {
            a.mostrar();
        }
    }
}
