/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.bp;


 import java.util.Scanner;
public class arrayMultiQuisBp {
    public static void main(String[] args) {
        String barang[][]= {{"Pensil","Pulpen","Penggaris"},{"3000","4000","5000"},};
        for (int i = 0; i < barang.length; i++) {
            for (int j = 0; j < barang.length+1; j++) {
                System.out.println(barang[i][j]);
            }
        }
       
    }
}
