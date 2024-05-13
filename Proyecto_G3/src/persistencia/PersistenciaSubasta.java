package persistencia;

import java.io.*;
import galeria.Subasta;

public class PersistenciaSubasta {
    
    // Asumiendo la ruta al archivo donde se guardan las subastas.
    private static final String RUTA_ARCHIVO_SUBASTAS = "ruta/del/directorio/subastas.dat";

    // Método para guardar subastas en un archivo.
    public void guardarSubastas(List<Subasta> listaSubastas) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCHIVO_SUBASTAS))) {
            oos.writeObject(listaSubastas);
        }
    }

    // Método para cargar subastas de un archivo.
    @SuppressWarnings("unchecked") // Esta anotación suprime advertencias de conversión no verificada
    public List<Subasta> cargarSubastas() throws IOException, ClassNotFoundException {
        List<Subasta> listaSubastas;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCHIVO_SUBASTAS))) {
            listaSubastas = (List<Subasta>) ois.readObject();
        }
        return listaSubastas;
    }
}

