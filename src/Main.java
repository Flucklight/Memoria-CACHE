import java.util.ArrayList;

public class Main {
    private static RAM ram = new RAM();
    private static Cache cache = new Cache();
    private static Registro registro = new Registro();
    private static TablaDatos tabla = new TablaDatos();
    private static ArrayList<Dato> proporcion = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(tabla.toString());
        tabla.setTabla(QuickSort(tabla.getTabla()));
        System.out.println(tabla.toString());
        for (Dato dato : tabla.getTabla()) {
            if (registro.almacenarInformacion(dato)){
                System.out.println(registro.toString());
            } else if (cache.almacenarInformacion(dato)) {
                System.out.println(cache.toString());
            } else if (ram.almacenarInformacion(dato)){
                System.out.println(ram.toString());
            }
        }
    }

    private static ArrayList QuickSort(ArrayList<Dato> arreglo) {
        if(arreglo.size() > 1) {
            int pivote = arreglo.get(0).getAccesosPrevios();
            ArrayList<Dato> Mayor = new ArrayList<>();
            ArrayList<Dato> Menor = new ArrayList<>();
            ArrayList<Dato> Igual = new ArrayList<>();

            for (Dato valor : arreglo) {
                if (valor.getAccesosPrevios() > pivote){
                    Mayor.add(valor);
                } else if (valor.getAccesosPrevios() < pivote){
                    Menor.add(valor);
                } else if (valor.getAccesosPrevios() == pivote){
                    Igual.add(valor);
                }
            }

            arreglo.clear();
            arreglo.addAll(QuickSort(Mayor));
            arreglo.addAll(Igual);
            arreglo.addAll(QuickSort(Menor));
            return arreglo;
        } else {
            return arreglo;
        }
    }
}
