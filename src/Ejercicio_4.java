import javax.swing.*;
import java.util.Scanner;

/*Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que se
llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los
elementos introducidos).*/

public class Ejercicio_4 {

    // vector de 10 elemtos enteros
    int[] enteros;

    Scanner scanner;

    //metodo por defecto
    public Ejercicio_4() {

        enteros = new int[10];

        scanner = new Scanner(System.in);
    }

    //funcion
    public void ejecutar() {
        for (int i = 0; i < enteros.length; i++) {

            System.out.println("Ingrese numero[" + i + "] :");
            int entero = scanner.nextInt();
            if (entero > 0) {
                enteros[i] = entero;
            } else {
                break;
            }
        }
        //mostrar
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] > 0) {

                System.out.println("numeros introducidos[" + i + "] :" + enteros[i]);
            }
        }
    }
}