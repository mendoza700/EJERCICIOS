import java.util.Scanner;
/*Realice un algoritmo para generar N elementos de la sucesión de Fibonacci (0, 1, 1, 2, 3, 5, 8, 13,…). Realice el diagrama de flujo, el pseudocódigo y
el diagrama N/S para representarlo, utilizando el ciclo apropiado.
El planteamiento del algoritmo correspondiente se hace a partir del
análisis de la sucesión, en la que se puede observar que un tercer valor de
la serie está dado por la suma de los dos valores previos, de aquí que se
asignan los dos valores para sumar (0, 1), que dan la base para obtener el
siguiente elemento que se busca, además, implica que el ciclo se efectué
dos veces menos.
Las variables que se requieren para la solución de este problema se
muestran en la tabla 4.7. En lo que respecta a qué tipo de ciclo se debe
utilizar, es indistinto, por lo cual se muestran las tres alternativas a continuación.
 1. Inicio
2. Leer N
3. Hacer A = 0
4. Hacer A = 0
5. Escribir A, B
6. Hacer M = 1
7. Mientras M < = (N - 2)
 Hacer C = A + B
 Escribir C
 Hacer A = B
 Hacer B = C
 Hacer M = M + 1
Fin mientras
8. Fin*/
public class ejercicio4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresamos los numeros dee los elentos: ");
        int N = scanner.nextInt();
        int A = 0;
        int B = 1;
        System.out.println(A + ", " + B);
        for (int  M = 1; M <= N - 2; M++){
            int C = A + B;
            System.out.println(C);
            A= B;
            B= C;

        }
    }
}
