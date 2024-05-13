package galeria;

public class Video extends Pieza {
    private String formato;
    private double duracion; // En segundos
    private String resolucion;

    public Video(int idPieza, String titulo, int anio, String lugar, String autor, boolean valorFijo,
                 String estadoVenta, double valorMinimo, double valorInicial, String formato,
                 double duracion, String resolucion) {
        super(idPieza, titulo, anio, lugar, autor, valorFijo, estadoVenta, valorMinimo, valorInicial);
        this.formato = formato;
        this.duracion = duracion;
        this.resolucion = resolucion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public void agregarPieza() {
        System.out.println("Agregando video " + this.getTitulo() + " al sistema.");
        super.añadirAHistorial("Video agregado: " + this.getTitulo());
    }

    public void modificarPieza() {
        System.out.println("Modificando video " + this.getTitulo() + ".");
        super.añadirAHistorial("Video modificado: " + this.getTitulo());
    }

    public void eliminarPieza() {
        System.out.println("Eliminando video " + this.getTitulo() + " del sistema.");
        super.añadirAHistorial("Video eliminado: " + this.getTitulo());
    }
}