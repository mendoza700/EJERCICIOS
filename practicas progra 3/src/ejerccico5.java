import java.util.Scanner;

public class ejerccico5 {
    public static void main(String[] args) {
       /* Una empresa constructora vende terrenos con la forma A de la figura 2.2.
                Realice un algoritmo y represéntelo mediante un diagrama de flujo y el
        pseudocódigo para obtener el área respectiva de un terreno de medidas
        de cualquier valor. */
        Scanner scanner = new Scanner(System.in);

        double base ,alturatriangulorectangulo , alturarectangulo = 0, areatriangulo ,arearectangulo , areatotal;
        System.out.println(" inttroducimos la base del terreno : ");
        base = scanner.nextDouble();

        System.out.println("introducimos la altura dl triangulo y del rectangulo unidos: ");
        alturatriangulorectangulo = scanner.nextDouble();

        areatriangulo = ( base *alturatriangulorectangulo) /2;
        arearectangulo = base * alturarectangulo;
        areatotal = areatriangulo +alturarectangulo;
        System.out.println();


    }
}
