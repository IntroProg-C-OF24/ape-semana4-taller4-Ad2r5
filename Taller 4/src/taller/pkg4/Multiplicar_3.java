
package taller.pkg4;
import java.util.Scanner;
public class Multiplicar_3 {
        public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        int rta;
        System.out.println("Ingrese un numero entre 2 y 6");
        int num = dato.nextInt();
        if (num >= 2) {
            if (num <= 6) {
                System.out.println("Tabla de Multiplicar");
                for (int i = 0; i <= 12; i++) {
                    rta = num * i;
                    System.out.println(num + " X " + i + " = " + rta);
                }
            } else {
                System.out.println("El numero ingresado no es valido");
            }
        } else {
            System.out.println("El numero ingresado no es valido");
        }
    }
}

