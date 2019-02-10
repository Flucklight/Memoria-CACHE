import java.util.ArrayList;

public class Cache {
    private ArrayList registro;
    private int espacio;

    public Cache() {
        this.espacio = 512;
        this.registro = new ArrayList();
    }

    public Boolean almacenarInformacion(Informacion informacion) {
        if (informacion.getMemoria() <= espacio) {
            espacio -= informacion.getMemoria();
            registro.add(informacion);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "CACHE{" +
                "registro=" + registro + "\n" +
                ", espacio=" + espacio +
                '}';
    }
}
