/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g4s21halpp5;

import java.util.ArrayList;

/**
 *
 * @author lecona
 */
public class G4s21HALPP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        
        int[] arreglo = new int[]{1, 4, 6, 7, 8, 9};
        //Con el arreglo no cambia su tamaño, solo los valores
        //El arreglo es una variable de n dimensiones
        
        int[] arreglo2 = new int[10]; //se inicialiizan solo de 0 a 9 ya que son 10 elementos
        arreglo2[1] = 11;
        arreglo2[2] = 112;
        arreglo2[3] = 113;
        arreglo2[4] = 114;
        arreglo2[5] = 115;
        arreglo2[6] = 116;
        arreglo2[7] = 117;
        arreglo2[8] = 118;
        arreglo2[9] = 119;
       
        
        System.out.println("Valor de la variable en posicion 4 " + arreglo[3]);
        //Los corchetes son para indicar a la variable que se ira a la posicion especifica (indice)
        //Para imprimir los valores es vital recordar que las posiciones comienzan en 0 y no en 1
        
        arreglo[3] = 10;
        //arreglo[6] = 22; //Out of point (fuera del punto final del arreglo)
        
        System.out.println("Valores del arreglo 2");
        int i = 0;
        for(;;){
            System.out.println("array[" + i + "] = " + arreglo2[i]);
            i++;
            
            if(i > arreglo2.length-1){
                break;
            } 
        }
        
        //manera tradicional    
        for(i = 0; i<arreglo2.length; i++){
            System.out.println("array[" + i + "] = " + arreglo2[i]);
        }    
        
        ArrayList<Integer> objlista = new ArrayList<Integer>();
        
        objlista.add(15);
        objlista.add(10);
        objlista.add(22);
        
        for(i = 0; i < objlista.size(); i++){
            System.out.println("}Valores de la lista " + String.valueOf(objlista.get(i)));
        }
    }
    
}
