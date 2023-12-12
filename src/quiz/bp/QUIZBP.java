/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.bp;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class QUIZBP {

    public static void main(String[] args) {
        int angka[]= {3300,1022,7800,3400,6000};
        int i,j;
        
        for (i = 0; i < angka.length;i++){
            System.out.println(angka[i]);
        }
        System.out.println("sorting from as : ");
         for (i = 0; i < angka.length;i++){
             for(j = i;j<angka.length-1;j++){
                 if(angka[j] > angka[j+1]){
                     int temp = angka[j];
                     angka [j]= angka[j+1];
                     angka [j+1]= temp;
                     
                 }
                 
             }
             
         }
           for (i = 0; i < angka.length;i++){
            System.out.println(angka[i]);
           }
         
                
       
    }
    
}
