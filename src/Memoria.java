import java.util.ArrayList;

public class Memoria {
    private ArrayList registro;
    private int espacio;

    public Memoria(int espacio) {
        this.espacio = espacio;
        this.registro = new ArrayList();
    }

    public Boolean almacenarInformacion(Dato dato) {
        if (dato.getMemoria() <= this.espacio) {
            this.espacio -= dato.getMemoria();
            registro.add(dato);
            return true;
        } else {
            return false;
        }
    }

    public ArrayList getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList registro) {
        this.registro = registro;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    @Override
    public String toString() {
        return  "lista de datos almacenados = " + registro
                + "espacio = " + espacio;
    }
}
