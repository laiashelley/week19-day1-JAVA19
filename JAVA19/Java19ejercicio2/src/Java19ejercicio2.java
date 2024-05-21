
// // 2- (medio) Llega Black Friday en tu tienda online de teléfonos móviles y decides ofrecer un 20% de descuento en todos tus productos.

// Instancia algunos móviles para probar.

// El descuento se aplica en todos, (static) así que debes poder mostrar el precio antiguo y el precio con descuento.

// +EXTRA: posibilidad de anular el descuento a todos los productos después del Black Friday, mediante método a tal propósito

public class Java19ejercicio2 {
    public static void main(String[] args) throws Exception {

        // instancio los moviles
        
        Moviles movil1 = new Moviles("Samsung", 800, "Corea del Sur");
        Moviles movil2 = new Moviles("Apple", 999, "Estados Unidos");
        Moviles movil3 = new Moviles("Xiaomi", 400, "China");

        // muestro el toString base de los moviles: 

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Movil 1: ");
        System.out.println();
        System.out.println(movil1);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Movil 2: ");
        System.out.println();
        System.out.println(movil2);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("Movil 3: ");
        System.out.println();
        System.out.println(movil3);
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

        // Depués del Black Friday, con los descuentos anulados:

        Moviles.getAnularDescuento();

        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("El precio sin el descuento del movil 1 es: ");
        System.out.println(movil1.getPrecio());
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("El precio sin el descuento es: ");
        System.out.println(movil2.getPrecio());
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("El precio sin el descuento es: ");
        System.out.println(movil3.getPrecio());
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println();

    }
}
