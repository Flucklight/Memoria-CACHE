import java.util.ArrayList;

public class Main {
    private static RAM ram = new RAM();
    private static Cache cache = new Cache();
    private static Registros registros = new Registros();
    private static TablaInformacion tabla = new TablaInformacion();
    private static ArrayList<Informacion> proporcion = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(tabla.toString());
        tabla.setTabla(QuickSort(tabla.getTabla()));
        System.out.println(tabla.toString());
        for (Informacion informacion : tabla.getTabla()) {
            if (registros.almacenarInformacion(informacion)){
                System.out.println(registros.toString());
            } else if (cache.almacenarInformacion(informacion)) {
                System.out.println(cache.toString());
            } else if (ram.almacenarInformacion(informacion)){
                System.out.println(ram.toString());
            }
        }
    }

    private static ArrayList QuickSort(ArrayList<Informacion> arreglo) {
        if(arreglo.size() > 1) {
            int pivote = arreglo.get(0).getAccesosPrevios();
            ArrayList<Informacion> Mayor = new ArrayList<>();
            ArrayList<Informacion> Menor = new ArrayList<>();
            ArrayList<Informacion> Igual = new ArrayList<>();

            for (Informacion valor : arreglo) {
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
