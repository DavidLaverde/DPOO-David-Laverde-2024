package galeria;

public class Articulo {
    // Atributos de la clase Articulo
    private String id;
    private String descripcion;
    // Otros atributos relevantes

    // Constructor
    public Articulo(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Otros métodos relevantes
}

