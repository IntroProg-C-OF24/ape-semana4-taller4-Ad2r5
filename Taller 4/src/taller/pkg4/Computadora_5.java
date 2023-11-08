
package taller.pkg4;
import java.util.Scanner;
public class Computadora_5 {
    
    public static void main(String[] args) {
        double costoCPU, costoTeclado, costoPantalla, costoRaton, costoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del CPU ");
        costoCPU = teclado.nextDouble();
        System.out.println("Ingrese el valor del Teclado ");
        costoTeclado = teclado.nextDouble();
        System.out.println("Ingrese el valor de la Pantalla ");
        costoPantalla = teclado.nextDouble();
        System.out.println("Ingrese el valor del Raton ");
        costoRaton = teclado.nextDouble();
        costoTotal = (costoCPU + costoTeclado + costoPantalla + costoRaton);
        System.out.println("Ingrese el valor total de la computadora de escritorio " + costoTotal);
    }
}
