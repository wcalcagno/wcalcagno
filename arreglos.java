package ejemploarreglos;
import java.util.Scanner;
/*
* @author Usuario
*/
public class EjemploArreglos{

/**
    * @param args the command line arguments
 */
    public static void main(String[] args)
        //TODO code application logic here
        Scanner read = new Scanner (System.in);
        double [] notas = new double;

        //ingreso de notas desde la consola de java
        for ( int 1 = 0 ; i < 4 i++) {
            System.out.println("Ingrese la nota "+(i+1) + " del alumno");
            notas[i] = read.nextDouble();
        }
        // Imprimir notas
        for (int i=0 ; i <= 4 ; i++) {
            System.out.println("nota " + (i +1) + ": " + notas[i]);
        }
        //Buscar elementos en el arreglo
        double valor;
        boolean encontrado = false;
        System.out.println("Ingrese la nota a buscar");
        valor = read.nextDouble();
        for (int i = 0; i <= 4; i++){
            if (valor == notas[i]) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("Nota encontrada");
        } else {
            System.out.println("Nota NO encontrada");
        }
    //Promedio de notas
    double suma = 0;
    for (int i = 0; i <= 4; i++) {
        suma = suma + notas[i]
    }
    System.out.println("El promedio de notas es: "+suma / 5);
    
    //calculo de la nota minima
    double minimo = notas[0];
    for ( int i = 0; i <= 4; i++){
        if (notas[i]< minimo) {
            minimo = notas[i]
        }
    }
    System.out.println("La nota minima es: " + minimo);

    //Calculo de la nota maxima
    double maximo = notas[0];
    for ( int i =0; i<=4; i++){
        if (notas[i]>maximo){
            maximo = notas[i];
        }
    }
    System.out.println("La nota maxima es: " + maximo);

}
