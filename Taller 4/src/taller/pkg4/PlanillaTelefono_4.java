
package taller.pkg4;
import java.util.Scanner;
public class PlanillaTelefono_4 {
    public static void main(String[] args) {
               int numIngresar;
       //DECLARANDO E INICIALIZANDO
       Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese un número entre el 2 y 6: ");
        numIngresar = teclado.nextInt();
        System.out.println("TABLA PRESENTADA");
        System.out.println("");
        for (int i = 1; i <= 12; i++) {
        //número*i = (número*i)
            System.out.println(numIngresar * i);
        }    
    }
} 
    
