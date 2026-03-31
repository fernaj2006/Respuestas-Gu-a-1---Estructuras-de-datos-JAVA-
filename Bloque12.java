import java.util.Scanner;

public class Bloque12 {
    
    public static void main(String[] arg){

        Scanner lector = new Scanner(System.in);

        System.out.println("¿Cuantos alumnos tiene?");

        int alumnos = lector.nextInt();

        double[] nota_curso = new double[alumnos];
        double nota_alta = 0;
        double nota_baja = 7;

        for (int i = 0; i < alumnos; i++){

            System.out.println("Ingrese la nota ("+(i+1)+"):");
            double numero_ingresado = lector.nextDouble();
            
            if(numero_ingresado<=7 && numero_ingresado>=1){
                nota_curso[i] = numero_ingresado;

                if(nota_alta<numero_ingresado){
                    nota_alta=numero_ingresado;
                }

                if (nota_baja>numero_ingresado){
                    nota_baja=numero_ingresado;
                }
            }
            else{
                System.out.println("Nota no valida");
                i-=1;
            }
        }

        System.out.println();
        System.out.println("La nota más alta es:");
        System.out.println(nota_alta);
        System.out.println();
        System.out.println("La nota más baja es:");
        System.out.println(nota_baja);
        System.out.println();

        double suma=0;
        
        for(int i=0;i<alumnos;i++){
            suma += nota_curso[i];
        }

        double promedio = suma/alumnos;

        for(int i=0;i<alumnos;i++){
            if(nota_curso[i]>promedio){
                System.out.println("La nota del alumno "+(i+1)+" es mayor al promedio");
            }
            else if(nota_curso[i]<promedio){
                System.out.println("La nota del alumno "+(i+1)+" es menor al promedio");
            }
            else{
                System.out.println("La nota del alumno "+(i+1)+" es igual al promedio");
            }
        }
    }
    
}
