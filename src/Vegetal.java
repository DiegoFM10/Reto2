public class Vegetal extends Producto{
    String temporada;

    public Vegetal(String nombre, String col, double prec, String sabor, String temporada) {
        super(nombre, col, prec, sabor);
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return  "\tProducto-Nombre: " + nombre +
                "\tColor: " + color +
                "\tPrecio: $" + precio +
                "\tTipo Sabor: " + tipoSabor +
                "\ttemporada:" + temporada;
    }
}
