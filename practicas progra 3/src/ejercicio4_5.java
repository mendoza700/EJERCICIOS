import java.util.Scanner;

public class ejercicio4_5 {
    /*Se requiere un algoritmo para obtener la estatura promedio de un grupo de personas, cuyo número de miembros se desconoce, el ciclo debe
    efectuarse siempre y cuando se tenga una estatura registrada. Realice el
    diagrama de flujo, el pseudocódigo y el diagrama N/S para representarlo,
    utilizando el ciclo apropiado.
    Como se puede ver, para resolver este problema no se puede utilizar
    el ciclo Desde, ya que no se tiene el número de personas exacto, que es lo
    que en un momento determinaría el número de veces que el proceso que
    se encuentra dentro del ciclo se ejecute, para este caso es necesario contar
    al menos con la estatura de una persona (para que tenga caso realizar el
            proceso del ciclo). Por otro lado, si se utiliza el ciclo Repite, se ejecutará
    por lo menos una vez y hasta que se le proporcione una estatura menor
    o igual a cero, por tal motivo no es muy conveniente utilizarlo, ya que se
    debe tener al menos una estatura para realizar lo que se pretende con el
    algoritmo.
    El ciclo que es apropiado para utilizar en la solución de este problema es Mientras, ya que este ciclo se realiza siempre y cuando se cuente con
    una estatura mayor a cero, de una manera natural sin forzar el proceso en
    ningún momento, y en caso de que no se tenga estatura registrada el promedio es cero, y se debe indicar que no existe ninguna estatura registrada.
    La tabla 4.3 muestra las variables que se van a utilizar para la solución de este problema. La representación del algoritmo para este problema se presenta mediante el diagrama de flujo 4.7, el pseudocódigo 4.7 y el
    diagrama N/S 4.7, en los cuales se utiliza el ciclo Mientras.
    1. Inicio
2. Hacer SU = 0
3. Leer ES
4. Hacer C = 0
5. Mientras ES > 0
    Hacer SU = SU + ES
    Leer ES
    Hacer C = C + 1
    Fin mientras
6. Si C = 0
    Entonces
    Escribir “No hay estaturas”
    Si no
    Hacer PR = SU / C
    Fin compara
7. Escribir PR
8. Fin*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SU = 0; // suma de estaturas
        int C = 0;// contador de estaturas
        double ES ; // actual estura
        System.out.println("ingrese las estatura (0 patra termimar): ");
        // leeemos la prinmera estura

        ES = scanner.nextDouble();

        while (ES > 0){
            SU += ES ;
            C++;
            // LEEMOS LAS SIGUIENTES ESTURAS
            if ( C == 0){
                System.out.println("no hay estaturas ");

            }else{
                double PR = SU / C; //preomedio de esturas
                System.out.println(" el promedio de estaturas es:"+ PR );

            }

        }




    }

}
