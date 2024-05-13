package galeria;

import galeria.Pieza;

public class Impresion extends Pieza {
    private String tecnicaImpresion;
    private String tipoPapel;
    private String tamano;

    public Impresion(int idPieza, String titulo, int anio, String lugar, String autor, boolean valorFijo,
                     String estadoVenta, double valorMinimo, double valorInicial, String tecnicaImpresion,
                     String tipoPapel, String tamano) {
        super(idPieza, titulo, anio, lugar, autor, valorFijo, estadoVenta, valorMinimo, valorInicial);
        this.tecnicaImpresion = tecnicaImpresion;
        this.tipoPapel = tipoPapel;
        this.tamano = tamano;
    }

    public String getTecnicaImpresion() {
        return tecnicaImpresion;
    }

    public void setTecnicaImpresion(String tecnicaImpresion) {
        this.tecnicaImpresion = tecnicaImpresion;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public void agregarPieza() {
        System.out.println("Agregando impresión " + this.getTitulo() + " al sistema.");
    }

    @Override
    public void modificarPieza() {
        System.out.println("Modificando impresión " + this.getTitulo() + ".");
    }

    @Override
    public void eliminarPieza() {
        System.out.println("Eliminando impresión " + this.getTitulo() + " del sistema.");
    }
}