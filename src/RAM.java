public class RAM extends Memoria{

    public RAM() {
        super(19200);
    }

    @Override
    public String toString() {
        return "RAM {" + "\n"
                + "registro=" + getRegistro() + "\n"
                + "espacio=" + getEspacio() + "\n"
                + '}';
    }
}
