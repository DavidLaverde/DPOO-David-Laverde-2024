package galeria;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Subasta {
    private String idSubasta;
    private Date fechaInicio;
    private Date fechaFin;
    private EstadoSubasta estado;
    private final List<Articulo> articulos;
    private double precioBase;
    private double precioActual;
    private Usuario ganador;

    public enum EstadoSubasta { ACTIVA, CERRADA, NO_INICIADA } 

    public Subasta(String idSubasta, Date fechaInicio, Date fechaFin, EstadoSubasta estadoInicial, List<Articulo> articulos, double precioBase) {
        this.idSubasta = idSubasta;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estadoInicial;
        this.articulos = articulos != null ? new ArrayList<>(articulos) : null;
        this.precioBase = precioBase;
        this.precioActual = precioBase; 
    }

    protected void iniciarSubasta() {
        if (estado == EstadoSubasta.NO_INICIADA) { 
            estado = EstadoSubasta.ACTIVA;
            // Todo: Lógica adicional para iniciar la subasta
        }
    }

    protected void cerrarSubasta() {
        if (estado == EstadoSubasta.ACTIVA) { 
            estado = EstadoSubasta.CERRADA;
            // Todo: Lógica adicional para cerrar la subasta
        }
    }

    public boolean realizarOferta(Usuario usuario, double oferta) {
        Date ahora = new Date();
        if (oferta > precioActual && estado == EstadoSubasta.ACTIVA && ahora.before(fechaFin)) {
            precioActual = oferta;
            ganador = usuario;
            // Todo: Lógica adicional para manejar la nueva oferta
            return true;
        }
        return false;
    }

    public List<Articulo> getArticulosSubasta() {
        return articulos; // Devuelve la lista inmutable de artículos
    }

    public EstadoSubasta getEstadoSubasta() {
        return estado;
    }

    
}