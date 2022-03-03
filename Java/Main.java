package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Tutar: ");
        tutar = input.nextDouble();

        kdvTutar = tutar* kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("KDVli tutar: "+kdvliTutar);





        
        
    }
}