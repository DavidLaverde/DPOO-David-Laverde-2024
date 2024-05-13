package persistencia;

import java.util.List;

public class FormatoDeArchivo {
    public String toTexto(List<Persistible> datos) {
        return "";
    }

    public byte[] toBinario(List<Persistible> datos) {
    	return new byte[2];
    }
}

