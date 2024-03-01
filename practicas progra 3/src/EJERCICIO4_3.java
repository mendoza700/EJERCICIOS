import java.util.Scanner;

public class EJERCICIO4_3 {
    /*Se requiere un algoritmo para obtener la suma de diez cantidades mediante la utilización de un ciclo Desde. Realice el diagrama de flujo, el pseudocódigo y el diagrama N/S para representarlo.
    El ciclo Desde también es conocido como ciclo For en los diferentes
    lenguajes de programación. Se utilizarán las mismas variables mostradas
    en la tabla 4.1. El diagrama de flujo 4.3 muestra la solución correspondiente utilizando el ciclo Desde
  1. Inicio
2. Hacer SU = 0
3. Desde C = 1 hasta C = 10
 Leer VA
 Hacer SU = SU + VA
Fin desde
4. Escribir SU
5. Fin */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SU = 0;
        for (int C = 1; C <= 10; C++) ;
        {
            System.out.println("ingrese el valor de:");
            int VA = scanner.nextInt();
            SU += VA;
        }
        System.out.println(" la suma es : " + SU);


    }

}