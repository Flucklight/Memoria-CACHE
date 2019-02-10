import java.util.ArrayList;
import java.util.Random;

public class TablaInformacion {

    private ArrayList<Informacion> tabla;
    private Random random;

    public TablaInformacion() {
        tabla = new ArrayList<>();
        random = new Random();
        random.setSeed(10);
        Informacion aux;
        for (int i = 0; i < 200; i++) {
            tabla.add(aux = new Informacion((random.nextGaussian() * 5) + 15, (random.nextGaussian() * 5) + 20));
        }
    }

    public ArrayList<Informacion> getTabla() {
        return tabla;
    }

    public void setTabla(ArrayList<Informacion> tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "TablaInformacion{" +
                "tabla=" + tabla +
                '}';
    }
}
