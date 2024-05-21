public class Moviles {

    private String marca;
    private double precio;
    private String origen;

    private static double descuento = 0.20;

    public Moviles() {
    }

    public Moviles(String marca, double precio, String origen) {
        this.marca = marca;
        this.precio = precio;
        this.origen = origen;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getDescuento(){
        return precio * ( 1 - descuento);
    }

    public static void getAnularDescuento(){
        descuento = 0;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Precio original: " + getPrecio() + "; " +
            "Origen: " + getOrigen() + "; " + "Precio final con el 20% de descuento: " + getDescuento();

    }

}
