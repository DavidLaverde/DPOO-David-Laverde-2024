package persistencia;

import java.io.*;
import java.util.List;

public class GestorDePersistencia {

    private String rutaArchivo;

    public GestorDePersistencia(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void guardarDatos(List<Object> datos) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaArchivo))) {
            out.writeObject(datos);
        } catch (IOException e) {
            throw new IOException("Error al guardar los datos en el archivo", e);
        }
    }

    public List<Object> cargarDatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            return (List<Object>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw e;
        }
    }
}

