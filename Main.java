public class Main {
    public static void main(String[] args) {
        int opcion = Leer.leerEntero("Introduce una opción: ");
        switch(opcion){
            case 1:
                Ejercicio_1.ejercicio_1();
            case 2:
                Ejercicio_2.ejercicio_2();
        }
    }
}