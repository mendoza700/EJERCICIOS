import java.util.Scanner;

public class ejercicio4 {
   /* Se requiere obtener el área de una circunferencia. Realizar el algoritmo
    correspondiente y representarlo mediante un diagrama de flujo y el pseudocódigo correspondiente.
    De igual forma que en los problemas anteriores, es importante establecer la tabla de variables que se utilizarán para la solución del problema,
    pero ahora previamente se analizará qué se requiere para obtener el área
    de la circunferencia.
    Si se analiza la fórmula que se utiliza para tal fin, se puede establecer
    que se requiere un valor de radio solamente y que se debe dar un valor
    constante, que es el valor de PI, que se establece como 3.1416. Con esto
    ahora se puede establecer la tabla 2.5 con las variables correspondientes*/
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double radio, area, PI = 3.1416;
       System.out.println("introduce el radio de la circunferenciaÇ:");
       radio = scanner.nextDouble();
       area = PI * Math.pow(radio, 2);
       System.out.println();
       {

       }
   }}