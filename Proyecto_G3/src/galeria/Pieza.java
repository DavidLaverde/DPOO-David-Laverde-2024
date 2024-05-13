package galeria;

import java.util.ArrayList;
import java.util.List;

public abstract class Pieza {
    private int idPieza;
    private String titulo;
    private int anio;
    private String lugar;
    private String autor;
    private boolean valorFijo;
    private String estadoVenta;
    private double valorMinimo;
    private double valorInicial;
    
    private List<String> historialOperaciones; 

    public Pieza(int idPieza, String titulo, int anio, String lugar, String autor, boolean valorFijo, String estadoVenta, double valorMinimo, double valorInicial) {
        this.idPieza = idPieza;
        this.titulo = titulo;
        this.anio = anio;
        this.lugar = lugar;
        this.autor = autor;
        this.valorFijo = valorFijo;
        this.estadoVenta = estadoVenta;
        this.valorMinimo = valorMinimo;
        this.valorInicial = valorInicial;
        this.historialOperaciones = new ArrayList<>();
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isValorFijo() {
        return valorFijo;
    }

    public void setValorFijo(boolean valorFijo) {
        this.valorFijo = valorFijo;
    }

    public String getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public List<String> getHistorialOperaciones() {
        return historialOperaciones;
    }

    public abstract void agregarPieza();
    public abstract void modificarPieza();
    public abstract void eliminarPieza();

    public void consultarHistorial() {
        historialOperaciones.forEach(operacion -> System.out.println(operacion));
    }
    
    protected void añadirAHistorial(String operacion) {
        historialOperaciones.add(operacion);
    }
}