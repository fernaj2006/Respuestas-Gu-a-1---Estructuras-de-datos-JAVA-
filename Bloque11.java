import java.util.Scanner;

public class Bloque11 {
    
    public static void main(String[] arg){

        Scanner lector = new Scanner(System.in);

        // Se pide el tamaño del array

        System.out.println("Introduzca el tamaño del array: ");
        int tamaño_array = lector.nextInt();

        // Se asigna el tamaño

        int[] array = new int[tamaño_array];

        for (int i = 0; i < tamaño_array; i++){
            System.out.println("Ingrese un numero entero positivo ("+(i+1)+"):");
            int numero_ingresado = lector.nextInt();
            
            if(numero_ingresado > 0){
                array[i] = numero_ingresado;
            } else {
                System.out.println("El numero no es entero positivo");
                i -= 1;
            }
        }

        //Se imprimime el array normal

        System.out.println("\nEl array normal es:");
        for (int num : array) {
            System.out.print(num + " ");
        }
      
        
        //Se invierte

        int aux;
        for (int i=0; i < array.length/2; i++) {
            aux = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = aux;
        }
        
        //Se imprimime el array invertido

        System.out.println("\nEl array invertido es:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        
        lector.close(); 
    }
}
