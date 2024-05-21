public class Cacatua {
    
    private String nombre;

    // creo variable static de cantidadMinima:

    private static int cantidadMinimaCacahuetes = 100;

    public Cacatua() {
    }

    public Cacatua(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // creo los metodos para que devuelvan los valores de las cosas creadas "a parte de la variable private estandard":

    public int getCantidadMinimaCacahuetes(){
        return cantidadMinimaCacahuetes;
    }

    public String fraseCacatua(){
        return "'Cacatua cacahuete!'";
    }

    // en el toString, añado la fraseCacatua() i la variable static de CantidadMinima, para que se muestre toda la frase.

    @Override
    public String toString() {
        return "La cacatúa se llama " + getNombre() + ", dice " + fraseCacatua() + " y lo mínimo para que se calle son " + getCantidadMinimaCacahuetes() + " cacahuetes.";
    }

}