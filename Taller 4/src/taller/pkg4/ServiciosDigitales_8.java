
package taller.pkg4;
import java.util.Scanner;
public class ServiciosDigitales_8 {
        public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        double Netflix;
        double Youtube;
        double Dropbox;
        double Spotify;
        int edad;
        double rta;
        System.out.println("Ingrese el valor al mes de netflix");
        Netflix = dato.nextDouble();
        System.out.println("Ingrese el valor al mes de Youtube Premium");
        Youtube = dato.nextDouble();
        System.out.println("Ingrese el valor al mes de Dropbox");
        Dropbox = dato.nextDouble();
        System.out.println("Ingrese el valor al mes de Spotify");
        Spotify = dato.nextDouble();
        System.out.println("Ingrese su edad");
        edad = dato.nextInt();
        if (edad >= 30) {
            rta = Netflix + Youtube + Dropbox + Spotify;
            double descuento = rta * 0.2;
            rta = rta - descuento;
            System.out.println("El valor total es de: " + rta);
        } else {
            rta = Netflix + Youtube + Dropbox + Spotify;
            System.out.println("El valor total es de: " + rta);
        }
        
    }


    
}
