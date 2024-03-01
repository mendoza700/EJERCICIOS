import java.util.Scanner;
public class ejercicio4_1 {
   /* Se requiere un algoritmo para obtener la suma de diez cantidades mediante la utilización de un ciclo “Mientras”. Realice el diagrama de flujo, el
    pseudocódigo y el diagrama N/S para representarlo.
    Con base en lo que se requiere determinar se puede establecer que
    las variables requeridas para la solución del problema son las mostradas
    en la tabla 4.11. Inicio
2. Hacer SU = 0
3. Hacer C = 1
4. Mientras C < = 10
 Leer VA
 Hacer SU = SU + VA
 Hacer C = C + 1
Fin mientras
5. Escribir SU
6. Fin*/
    public static void main(String[] args) {
        Scanner  sacner = new  Scanner (System.in);
        int  SU = 0;
        int c = 1;

        while (c <= 10){
            System.out.println("ingresa el valor: ");
            int VA = sacner.nextInt();
            SU += VA;
            c++;

        }
        System.out.println("la suma es mas: " + SU);
    }
}
