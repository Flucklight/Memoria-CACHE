import java.util.ArrayList;
import java.util.Random;

public class TablaDatos {

    private ArrayList<Dato> tabla;
    private Random random;

    public TablaDatos() {
        tabla = new ArrayList<>();
        random = new Random();
        random.setSeed(10);
        Dato aux;
        for (int i = 0; i < 200; i++) {
            tabla.add(aux = new Dato((random.nextGaussian() * 5) + 15, (random.nextGaussian() * 5) + 20));
        }
    }

    public ArrayList<Dato> getTabla() {
        return tabla;
    }

    public void setTabla(ArrayList<Dato> tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "TablaDatos {" + "\n"
                + "tabla = " + tabla + "\n"
                + '}';
    }
}
