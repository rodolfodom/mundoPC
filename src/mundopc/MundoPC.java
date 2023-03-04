package mundopc;
import com.gm.mundopc.*;
public class MundoPC {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("HP", 25);
        Raton raton = new Raton("USB", "Logitech");
        Teclado teclado = new Teclado("USB", "Logitech");
        Computadora computadora = new Computadora("Computadora Acer", monitor, teclado, raton);
        Computadora computadora1 = new Computadora("Computadora Apple", monitor, teclado, raton);
        Computadora computadora2 = new Computadora("Computadora HP" ,monitor, teclado, raton);

        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadora);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);

        orden1.mostrarOden();


    }

}
