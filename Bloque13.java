public class Bloque13 {
    public static void main(String[] args) {
        
        int[] array = new int[15];

        array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int S = 13;
        int suma = 0;

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){

                suma = array[i] + array[j];

                if(suma==S){
                    System.out.println(array[i] + "+" + array[j] + "=" + suma);
                }

            }
        }
    }
}

