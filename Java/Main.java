package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int a,b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucgenin bir kenarını girin: ");
        a = input.nextInt();
        System.out.print("Ucgenin diger kenarını girin: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+ (b*b));
        System.out.println("Hipotenüs: "+c);






        
        
    }
}