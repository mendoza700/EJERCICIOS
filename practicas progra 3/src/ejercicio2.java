import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
       /* Un estudiante realiza cuatro exámenes durante el semestre, los cuales tienen la misma ponderación. Realice el pseudocódigo y el diagrama de flujo
        que representen el algoritmo correspondiente para obtener el promedio
        de las calificaciones obtenidas.
        Las variables que se van a utilizar en la solución de este problema se
        muestran en la tabla 2.3.*/
        Scanner scanner = new Scanner(System.in);
        double C1, C2,C3, C4,S ,P;
        System.out.println("ingrerse la calificacion :1");
        C1 = scanner.nextDouble();

        System.out.println("ingrerse la calificacion :2");
        C2 = scanner.nextDouble();

        System.out.println("ingrerse la calificacion :3");
        C3 = scanner.nextDouble();

        System.out.println("ingrerse la calificacion :4");
        C4 = scanner.nextDouble();

        S = C1+C2+C3+C4;
        P = S /4;

        System.out.println("el promedio de las calificaciones es "+ P);


    }
}
