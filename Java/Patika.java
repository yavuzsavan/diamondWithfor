package Java;
import java.util.*;

public class Patika {
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        for(int i = 1; i <= n-1; i++){
            for(int j = 0; j < n-i+1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k< (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>0; i--){
            for(int k = 0; k<(n-i)+1;k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
