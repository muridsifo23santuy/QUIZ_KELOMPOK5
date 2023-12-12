/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.bp;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class searchingQuisBp {

    public static void main(String[] args) {
        int i;

        String kota[] = {"Jakarta", "Surabaya", "Bandung", "Mediun", "Solo"};
         for (i = 0; i < kota.length; i++) {
             System.out.print(kota[i]+",");
         }
         System.out.println("");
            System.out.println("Masukan Kata Untuk Dicari : ");
        Scanner s = new Scanner(System.in);
        String cari = s.next();

        boolean status = false;
        for (i = 0; i < kota.length; i++) {
            if (kota[i].compareToIgnoreCase(cari) == 0) {
                status = true;
                break;
            }
        }
        if (status == true) {
            System.out.println("ketemu,hasilnya adalah " + kota[i] + " ada di indeks " + i);
        } else {
            System.out.println("Tidak Ketemu");
        }

    }

}
