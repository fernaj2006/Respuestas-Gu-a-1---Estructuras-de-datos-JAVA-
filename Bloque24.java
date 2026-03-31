import java.util.Arrays;

public class Bloque24 {

    public static void main(String[] args) {
        
        int[] array = new int[15];

        array = new int[]{1,1,1,3,3,4,4,4,5,5,5,6,6,6,7};

        array = new Bloque24().metodoeliminacion(array);

        System.out.println(Arrays.toString(array));

    }

    public int[] metodoeliminacion(int[] array){

        int[] array_nuevo = new int[array.length];

        int j=0;

        for(int i = 0; i < array.length-1;i++){

            if(array[i] != array[i+1]){
                array_nuevo[j] = array[i];
                j++;
            }
        }

        array_nuevo[j] = array[array.length - 1];
        
        return array_nuevo;
    }
}