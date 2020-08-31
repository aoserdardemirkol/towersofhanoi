package com.towersofhanoi;

import java.util.Scanner;

public class Hanoi {
    static int sayac = 1;

    public void diskhareketi(int n, String baslangic, String gecis, String hedef) {
        if(n==1) {
            System.out.println(sayac + ". Hamle " + baslangic + " > " + hedef);
            sayac++;
        } else {
            diskhareketi(n - 1, baslangic, hedef, gecis);
            System.out.println(sayac + ". Hamle " + baslangic + " > " + hedef);

            sayac++;

            diskhareketi(n - 1, gecis, baslangic, hedef);
        }
    }

    public static void main(String args[]) {
        Hanoi sayi = new Hanoi();
        System.out.print("Kaç disk kullanmak istiyorsunuz ? : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("A = baslangic konumu , B = gecis konumu , C = hedef konum");
        sayi.diskhareketi(n, "A", "B", "C");
    }
}