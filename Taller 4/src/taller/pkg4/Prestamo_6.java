
package taller.pkg4;
import java.util.Scanner;
public class Prestamo_6 {
        public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double montoPrestamo;
        double tasaInteresesMensual;
        double totalMeses;
        System.out.println("Ingrese el total del prestamo");
        montoPrestamo = dato.nextDouble();
        System.out.println("Ingrese la tasa de interes mensual");
        tasaInteresesMensual = dato.nextDouble();
        System.out.println("Ingrese el  numero de plazo en meses");
        totalMeses = dato.nextDouble();
        double potencia = (Math.pow(1 + tasaInteresesMensual, totalMeses));
        double rta = (montoPrestamo*(tasaInteresesMensual*potencia))/(potencia - 1);
        System.out.println("La tasa que pagara sera: " + rta);
    }
}
    

