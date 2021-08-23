public class Fruta extends Producto{
    String tierra;

    public Fruta(String nombre, String col, double prec, String sabor, String tierra) {
        super(nombre, col, prec, sabor);
        this.tierra = tierra;
    }

    @Override
    public String toString() {
        return  "\tProducto-Nombre: " + nombre +
                "\tColor: " + color +
                "\tPrecio: $" + precio +
                "\tTipo Sabor: " + tipoSabor +
                "\ttierra:" + tierra;
    }
}

