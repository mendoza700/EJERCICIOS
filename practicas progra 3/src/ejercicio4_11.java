import java.util.Scanner;

public class ejercicio4_11 {
    public static void main(String[] args) {
      int KA =  70;
      int CB = 170;
      int R = CB - KA ;
      while (R > 0){
          KA ++;
          CB--;
          R = CB - KA ;
      }
      if ( R == 0){
          KA = CB;
      }else{
            KA-= 0.5;
      }
        System.out.println("punto de encuentro = " + KA );


    }
}
