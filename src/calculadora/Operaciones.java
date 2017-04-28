/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author APRENDIZ
 */
public class Operaciones {
    Scanner sc = new Scanner(System.in);
    public int numero1;
    public int numero2;
    public int cantidad;
    public int resultado;
    
    public void multiplicar(){
        System.out.println("Seleccione la cantidad de operaciones");
        cantidad = sc.nextInt();
        if (cantidad > 5){
            System.out.println("Maximo 5 operaciones");
        } else {
            for (int i = 0; i < cantidad; i++) {
                System.out.println("Operacion numero " + i);
                System.out.print("numero 1: ");
                numero1 = sc.nextInt();
                System.out.print("numero 2: ");
                numero2 = sc.nextInt();
                resultado = numero1 * numero2;
                System.out.println("El resultado de la operacion "+ i + " es: " + resultado);
            }
        }
    }
   
}
