import java.util.Scanner;

public class EJERCIO4_15 {
    /*Una empresa les paga a sus empleados con base en las horas trabajadas en
la semana. Para esto, se registran los días que laboró y las horas de cada
día. Realice un algoritmo para determinar el sueldo semanal de N trabajadores y además calcule cuánto pagó la empresa por los N empleados.
Represéntelo mediante diagrama de flujo, pseudocódigo y diagrama N/S,
utilizando el ciclo apropiado.
El planteamiento de este problema es una alternativa del problema
4.14, ya que para el presente se debe acumular día con día las horas que
labora cada trabajador, de tal forma que la tabla 4.14 muestra las variables
requeridas*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de empleados: ");
        int N = scanner.nextInt();
        double TOT = 0;
        for (int i = 1; i <= N; i++ ){
            System.out.println("ingrsde las horas trabajadas delk emopleado y el pago "+i + ",");
            int DT = scanner.nextInt();
            double PH = scanner.nextDouble();
           double SH = 0;

            for (int D = 1; i <= N ; i++){
                System.out.println(" ingrese las horas ytrabajadas en el dia " + D + ":" + ":");
                double HT = scanner.nextDouble();
                SH += HT;

            }
            double SS = SH *PH;
            System.out.println("el sueldo del trabador es " +i+ "es :$" + SS);
            TOT += SS;

        }
        System.out.println("el total que se pago es;: $ " + TOT);
    }
}
