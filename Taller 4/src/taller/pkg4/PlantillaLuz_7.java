
package taller.pkg4;
import java.util.Scanner;
public class PlantillaLuz_7 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double costokWh;
        double kWhConsumidos;
        int edad;
        double rta;
        System.out.println("Ingrese el costo del kilovatio/hora");
        costokWh = dato.nextDouble();
        System.out.println("Consumo del mes");
        kWhConsumidos = dato.nextDouble();
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad>=65)
        {
            rta = costokWh*kWhConsumidos;
            double descuento = rta  * 0.1;
            rta = rta - descuento;
            System.out.println("El costo a cancelar es: "+ rta);
        }
        else
        {
            rta = costokWh*kWhConsumidos;
            System.out.println("El costo a cancelar es : "+ rta);
        }
    }
}   
