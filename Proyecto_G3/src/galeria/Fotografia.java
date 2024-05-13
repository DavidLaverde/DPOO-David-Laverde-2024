package galeria;

public class Fotografia extends Pieza {
    private String dimensiones;
    private boolean edicionLimitada;

    public Fotografia(int idPieza, String titulo, int anio, String lugar, String autor, 
                      boolean valorFijo, String estadoVenta, int valorMinimo,
                      int valorInicial, String dimensiones, boolean edicionLimitada) {
        super(idPieza, titulo, anio, lugar, autor, valorFijo, estadoVenta, valorMinimo, valorInicial);
        this.dimensiones = dimensiones;
        this.edicionLimitada = edicionLimitada;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public boolean isEdicionLimitada() {
        return edicionLimitada;
    }

    public void setEdicionLimitada(boolean edicionLimitada) {
        this.edicionLimitada = edicionLimitada;
    }

    @Override
    public void agregarPieza() {
        // Implementación de la lógica para agregar una fotografía al sistema
        // Aquí podría ir el código para insertar los detalles de la fotografía en una base de datos
        System.out.println("Agregando fotografía con ID: " + getIdPieza());
    }

    @Override
    public void modificarPieza() {
        // Implementación de la lógica para modificar una fotografía en el sistema
        // Podría implementar una actualización en la base de datos aquí
        System.out.println("Modificando fotografía con ID: " + getIdPieza());
    }

    @Override
    public void eliminarPieza() {
        // Implementación de la lógica para eliminar una fotografía del sistema
        // Aquí se podría llamar a un método para eliminar una fila de una base de datos
        System.out.println("Eliminando fotografía con ID: " + getIdPieza());
    }

    @Override
    public String toString() {
        // Representación en cadena de la información de una Fotografia
        return "Fotografia{" +
                "idPieza=" + getIdPieza() +
                ", titulo='" + getTitulo() + '\'' +
                ", año=" + getAnio() +
                ", lugar='" + getLugar() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", valorFijo=" + isValorFijo() +
                ", estadoVenta='" + getEstadoVenta() + '\'' +
                ", valorMinimo=" + getValorMinimo() +
                ", valorInicial=" + getValorInicial() +
                ", dimensiones='" + dimensiones + '\'' +
                ", edicionLimitada=" + edicionLimitada +
                '}';
    }
}