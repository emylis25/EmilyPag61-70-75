package ejerciciospag75;

public class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    public void mostrar() {
        System.out.println("ID: " + id + ", Título: " + titulo +
                ", Edición: " + edicion + ", Autor: " + autor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro otro = (Libro) obj;
        return this.id == otro.id; // Solo compara por ID
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id); // Obligatorio para que funcione bien el Set
    }
}

