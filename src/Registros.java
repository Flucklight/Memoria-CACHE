import java.util.ArrayList;

public class Registros {
    private ArrayList registro;
    private int espacio;

    public Registros() {
        this.espacio = 256;
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
        return "Rregistros{" +
                "registro=" + registro + "\n" +
                ", espacio=" + espacio +
                '}';
    }
}
