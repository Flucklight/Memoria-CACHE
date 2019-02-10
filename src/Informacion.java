public class Informacion {
    private int memoria;
    private int accesosPrevios;

    public Informacion(double memoria, double accesosPrevios) {
        this.memoria = (int)memoria;
        this.accesosPrevios = (int)accesosPrevios;
    }

    public int getAccesosPrevios() {
        return accesosPrevios;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return  "Memoria necesaria = " + memoria +
                ", Accesos Previos = " + accesosPrevios;
    }
}
