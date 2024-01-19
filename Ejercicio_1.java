
public class Ejercicio_1 {
    public static void ejercicio_1(){
        int[] vector = new int [5];
        for (int i = 0; i < vector.length;i++){
            System.out.print(" ");
            System.out.print(vector[i]);
        }
        System.out.println();
        for (int i = 0; i < vector.length; i++){
            vector[i]=3;
        }
        System.out.println();
        for (int i = 0; i < vector.length;i++){
            System.out.print(" ");
            System.out.print(vector[i]);
        }
    }
}
