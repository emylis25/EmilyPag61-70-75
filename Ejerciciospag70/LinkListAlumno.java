package Ejerciciospag70;

import java.util.LinkedList;

public class LinkListAlumno {

        public static void main(String[] args) {
        LinkedList<Alumno> lista = new LinkedList<>();

        lista.add(new Alumno("001", "Emily", "C123"));
        lista.add(new Alumno("002", "Carlos", "C456"));
        lista.add(new Alumno("003", "Ana", "C789"));

        for (Alumno a : lista) {
            a.mostrar();
        }
    }
}
