/*
Algoritmo-1
Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
 */
package taller.pkg4;

import java.util.Scanner;

public class AreaTriangulo_1 {

    public static void main(String[] args) {
        double baseTriangulo;
        double alturaTriangulo;
        double areaTriangulo;
        Scanner teclado = new Scanner(System.in); //DECLARANDO E INICIALIZAR
        System.out.println("Ingrese la base del triangulo");
        baseTriangulo = teclado.nextDouble();
        System.out.println("Ingrse la altura del triangulo: ");
        alturaTriangulo = teclado.nextDouble();
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El area del triangulo es " + areaTriangulo);
    }

}
