public class Main {
    public static void main(String[] args) {
        int opcion = Leer.leerEntero("Introduce una opción: ");
        switch(opcion){
            case 1:
                Ejercicio_1.ejercicio_1();
                break;
            case 2:
                Ejercicio_2.ejercicio_2();
                break;
            case 3:
                Ejercicio_3.ejercicio_3();
                break;
        }
    }
}