import java.util.ArrayList;

public class RAM {
    private ArrayList registro;
    private int espacio;

    public RAM() {
        this.espacio = 1024;
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
        return "RAM{" +
                "registro=" + registro + "\n" +
                ", espacio=" + espacio +
                '}';
    }
}
