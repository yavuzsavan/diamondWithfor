package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int fizik, mat, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.println("Matematik Notu: ");
        mat = input.nextInt();
        System.out.println("Kimya Notu: ");
        kimya = input.nextInt();
        System.out.println("Turkce Notu: ");
        turkce = input.nextInt();
        System.out.println("Tarih Notu: ");
        tarih = input.nextInt();
        System.out.println("Muzik Notu: ");
        muzik = input.nextInt();

        int toplam = (fizik+ mat+ kimya+ turkce+ tarih+ muzik);
        double ortalama = toplam/ 6;

        System.out.println("Not Ortalaması: "+ ortalama);




        
        
    }
}