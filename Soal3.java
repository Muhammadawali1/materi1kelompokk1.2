/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal3;

/**
 *
 * @author user
 */
public class Soal3 {

    public static void main(String[] args) {
             // Bagian atas (segitiga terbalik)
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n"); 
        }

        // Bagian bawah (segitiga)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n"); 
        }

    }
}
