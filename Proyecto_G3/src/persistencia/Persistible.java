package persistencia;

public interface Persistible {
    void guardar(String datos);
    String cargar();
}