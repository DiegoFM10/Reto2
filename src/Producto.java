public class Producto {
    String nombre;
    String color;
    double precio;
    String tipoSabor;

    public Producto(String nombre, String col, double prec, String sabor){
        this.nombre = nombre;
        this.color = col;
        this.precio = prec;
        this.tipoSabor = sabor;
    }

     @Override
    public String toString() {
        return "***Inventario de productos***";
    }

}
