import java.util.Scanner;
/*Una persona adquirió un producto para pagar en 20 meses. El primer mes
pagó $10, el segundo $20, el tercero $40 y así sucesivamente. Realice un
algoritmo para determinar cuánto debe pagar mensualmente y el total de
lo que pagó después de los 20 meses y represéntelo mediante el diagrama
de flujo, el pseudocódigo y el diagrama N/S utilizando el ciclo apropiado.
La tabla 4.12 muestra las variables requeridas para plantear la solución del problema.
1. Inicio
2. Hacer P = 5.0
3. Desde I = 1 hasta I = 20
 Hacer P = P * 2
 Escribir “El pago mensual”, P
 Hacer T = T + P
Fin desde
4. Escribir “Pago total”, T
5. Fin*/
public class ejercicio4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P = 10;
        double T = 0;
        for (int i = 1; i <= 20; i++){
            P*= 2;
            System.out.println("el pago es: $"+ P );
            T+= P;

        }
        System.out.println(" pago total: " + T );
        }
    }

