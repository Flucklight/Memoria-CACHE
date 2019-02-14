public class Registro extends Memoria{

    public Registro() {
        super(30);
    }

    @Override
    public String toString() {
        return "Registro {" + "\n"
                + "lista de datos almacenados = " + getRegistro() + "\n"
                + "espacio = " + getEspacio() + "\n"
                + '}';
    }
}
