package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int n1, n2;
        char sign;

        Scanner sc= new Scanner(System.in);

        System.out.println("Type 1st number:");
        n1 = sc.nextInt();

        System.out.println("Type 2nd number:");
        n2 = sc.nextInt();

        System.out.println("Choose the process{ +:addition -:substraction *:multiplication /:divison }");
        sign = sc.next().charAt(0);

        switch(sign){
            case '+': System.out.println(n1+" + "+n2+" = "+(n1+n2));
                break;
            case '-': System.out.println(n1+" - "+n2+" = "+(n1-n2));
                break;
            case '*': System.out.println(n1+" * "+n2+" = "+(n1*n2));
                break;
            case '/': 
                if(n2 != 0){
                    System.out.println(n1+" / "+n2+" = "+(n1/n2));
                }
                else{
                    System.out.println("You cant divide a number to zero!!!");
                }
                break;
            default: System.out.println("Invalid sign!!!");
        }
    }
}