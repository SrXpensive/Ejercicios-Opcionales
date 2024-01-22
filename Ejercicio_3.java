public class Ejercicio_3 {
    public static void ejercicio_3(){
        int [] origen = {15,22,55,67,33,46,26,54,21,4};
        int [] destino = new int [origen.length];
        int j = 0;
        for(int i=0; i<origen.length; i++){
            if(origen[i]>30 && origen[i]%2==0){
                destino [j] = origen [i];
                j++;
            }
        }
        for (j = 0;j<destino.length; j++) {
            if (destino[j] > 0) {
                System.out.println("destino[" + j + "] = " + destino[j]);
            }
        }
    }
}
