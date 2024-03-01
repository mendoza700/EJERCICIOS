import java.util.Scanner;

public class ejercicio4_7 {
   /* Se requiere un algoritmo para determinar, de N cantidades, cuántas son
    menores o iguales a cero y cuántas mayores a cero. Realice el diagrama de
    flujo, el pseudocódigo y el diagrama N/S para representarlo, utilizando el
    ciclo apropiado.
    La tabla 4.5 muestra las variables que se requieren para plantear la
    solución del problema.1. Inicio
2. Hacer CP = 0
3. Hacer CN = 0
4. Leer NU
5. Hacer C = 1
6. Repite
 Leer CA
 Si CA > 0
 Entonces
 Hacer CP = CP + 1
 Si no
 Hacer CN = CN + 1
 Fin compara
 Hacer C = C + 1
Hasta C > NU
7. Escribir “Positivos:”, CP
8. Escribir “Negativos”, CN
9. Fin*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int CN = 0;
        System.out.println("ingrese el numero de cantidades: ");
        int NU = scanner.nextInt();
        int CP = 0;// cantidades posistivas
        for (int C = 1; C <= NU; C++){
            System.out.println("  ingresamos la cantidad: " + C + ":");
            int  CA = scanner.nextInt();//la cantida actual
            if (CA <= 0){
                CN++;
            } else {
                CP++;
            }
        }
        System.out.println("negatinos  "+ CN);
        System.out.println("positivos " + CP );
    }
}
