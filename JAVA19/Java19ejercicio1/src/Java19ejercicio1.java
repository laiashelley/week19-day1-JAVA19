
//1- (fácil) Entrenamiento (opcional)

// Tu amiga cacatúa está de vuelta!

// Tienes la clase Cacatua con un método static que cuando le llamas dice "Cacatúa cacahuete!".

// También tiene una variable estatica: cantidadMinimaCacahuetes = 100;

// Mostrar en un system.out lo siguiente: " la cacatúa se llama X (su nombre), dice 'Cacatúa cacahuete!' y lo mínimo para que se calle son 100 cacahuetes "

public class Java19ejercicio1 {
    public static void main(String[] args) throws Exception {

        // instanciamos las cacatuas
        
        Cacatua c1 = new Cacatua("Pepita");
        Cacatua c2 = new Cacatua("Pepito");
        Cacatua c3 = new Cacatua("Pepite");

        // muestro el toString de Cacatua:

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}
