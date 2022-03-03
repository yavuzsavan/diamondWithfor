package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        r = input.nextInt();

        double alan = pi*r*r;
        double cevre = 2*pi*r;

        System.out.println("Acıyı giriniz: ");
        int a = input.nextInt();

        double acıAlan = (pi*(r*r)*a)/360;

        System.out.println("Alan: "+alan);
        System.out.println("Cevre: "+cevre);
        System.out.println("Açısı a olan alan: "+acıAlan);






        
        
    }
}