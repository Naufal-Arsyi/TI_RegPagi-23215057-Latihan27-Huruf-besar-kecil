/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 * Nama  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : Program ini dibuat untuk membuat Uppercase dan lowercase dari suatu kalimat
 */
import java.util.Scanner;

public class TI_23215057_Latihan27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine();

        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
    }
}
