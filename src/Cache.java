public class Cache {
    private Memoria l1;
    private Memoria l2;
    private Memoria l3;

    public Cache() {
        this.l1 = new Memoria(120);
        this.l2 = new Memoria(480);
        this.l3 = new Memoria(1920);
    }

    public boolean almacenarInformacion(Dato dato) {
        if (l1.almacenarInformacion(dato)){
            return true;
        } else if (l2.almacenarInformacion(dato)) {
            return true;
        } else if (l3.almacenarInformacion(dato)){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cache {" + "\n"
                + "  l1 = " + l1.toString() + "\n"
                + ", l2 = " + l2.toString() + "\n"
                + ", l3 = " + l3.toString() + "\n"
                + '}';
    }
}
