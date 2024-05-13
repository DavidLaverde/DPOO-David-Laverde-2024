package persistencia;

import java.io.*;
import galeria.Pieza;

public class PersistenciaPieza {
    private String rutaDirectorio = "C:\\Users\\Mazin\\Desktop\\uni V.3\\DyP\\persistencia\\Piezas";

    public void guardarPieza(Pieza pieza) throws IOException {
        String archivo = rutaDirectorio + pieza.getIdPieza() + ".dat";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(pieza);
        }
    }

    public Pieza cargarPieza(String idPieza) throws IOException, ClassNotFoundException {
        String archivo = rutaDirectorio + idPieza + ".dat";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Pieza) in.readObject();
        }
    }

    public void setRutaDirectorio(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    // Main para pruebas de funcionalidad (quitar en la versión final)
    public static void main(String[] args) {
        // Logic para probar la carga y guardado de piezas
    }
}