import java.util.Scanner;

public class ejercio6 {
    public static void main(String[] args) {
       /* Se requiere obtener el área de la figura 2.3 de la forma A. Para resolver
        este problema se puede partir de que está formada por tres figuras: dos
        triángulos rectángulos, con H como hipotenusa y R como uno de los catetos, que también es el radio de la otra figura, una semicircunferencia que
        forma la parte circular (ver forma B). Realice un algoritmo para resolver el
        problema y represéntelo mediante el diagrama de flujo y el pseudocódigo. */
        Scanner scanner = new Scanner(System.in);
        double radio , hipotenusa ,cateto , areatriangular, areacircular ,areaqtotal,PI = 3.1416;

        System.out.println("introdic e el area de la circuferencia: ");
        radio = scanner.nextDouble();

        System.out.println("introduce la hipotenusa del triangulo rectangulo: ");
        hipotenusa = scanner.nextDouble();

        cateto= Math.sqrt(Math.pow(hipotenusa ,2) - Math.pow(radio ,2));
        areatriangular = (radio* cateto) / 2;
        areacircular = (PI * Math.pow(radio, 2)) / 2;
        areaqtotal = areatriangular + areatriangular;

        System.out.println("el area total de la figura es: %.2f\n"+areaqtotal);
    }

}
