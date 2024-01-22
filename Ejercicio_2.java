public class Ejercicio_2 {
    public static void ejercicio_2(){
        int suma = 0;
        int[] edades = new int [10];
        for (int i = 1; i <= edades.length; i++){
            int edad = Leer.leerEntero("Introduce la edad del alumno "+i+": ");
            edades[i-1] = edad;
        }
        System.out.println("--------------------");
        int num = Leer.leerEntero("Introduce el número del alumno cuya edad deseas saber: ");
        System.out.println("El alumno "+num+" tiene "+edades[num-1]+" años");
        System.out.println("--------------------");
        System.out.println("Suma de los 'n' primeros términos");
        int n = Leer.leerEntero("Introduce 'n': ");
        for (int i = 0; i< n; i++){
            suma += edades[i];
        }
        System.out.println("La suma de los "+n+" primeros elementos es "+suma);
    }
}
