import java.util.Scanner;

public class EJERCICO3 {
    public static void main(String[] args) {
       /* Se requiere conocer el área de un rectángulo. Realice un algoritmo para tal
        fin y represéntelo mediante un diagrama de flujo y el pseudocódigo para
        realizar este proceso.
                Como se sabe, para poder obtener el área del rectángulo, primeramente se tiene que conocer la base y la altura, y una vez obtenidas se presenta el resultado.
                La tabla 2.4 muestra las variables que se van a utilizar para elaborar
        el algoritmo correspondiente*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ingrese la longituyd de el rectangulo " );
        double longitud = scanner.nextDouble();
        System.out.println("ingrese el la longitud de la anchuraa de el rectangulo: ");
        double anchura = scanner.nextDouble();
        double  area = anchura * longitud;
        System.out.println("el area de rectangulo es:" + area);






    }
}
