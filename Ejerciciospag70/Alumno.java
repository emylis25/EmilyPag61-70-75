package Ejerciciospag70;
class Alumno {
    private String codigo;
    private String nombre;
    private String carnet;

    
    public Alumno(String codigo, String nombre, String carnet) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.carnet = carnet;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCarnet() {
        return carnet;
    }
    
       public void mostrar() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Carnet: " + carnet);
    }
}


