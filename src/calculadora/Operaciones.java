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

    public int numero1;
    public int numero2;
    public int cantidad;
    public int resultado;
    
    public void Sumar(){
    
    Scanner reader = new Scanner(System.in);
    
    System.out.println("Eliga La Cantidad De Sumas que desea Realizar: ");
    cantidad = reader.nextInt();
    
    
        if (cantidad<=10) {
            for (int i = 0; i < cantidad; i++) {
    System.out.println("Digite El Primer Número: ");
    numero1 = reader.nextInt();
    System.out.println("Digite El segundo Número: ");
    numero2 = reader.nextInt();
                resultado = numero1 + numero2;
                System.out.println("El Resultado de la suma: " +i);
                System.out.println("Es: " +resultado);
            }
            
        }else {
        
        System.out.println("Cantidad De Números Invalida.... Máximo 10");
        
        }
    
    
    }

}
