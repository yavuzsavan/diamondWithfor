package Java;
import java.util.*;

public class Patika {
    public static void main(String[] args){
        int n, top = 0, basamak=0, temp, j;

        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        temp = n;

        while(temp != 0){
            temp /= 10;
            basamak ++;
        }
        temp = n;
       for(int i = 1; i <= basamak ; i++){
           j = temp % 10 ;
           temp /= 10;
           top += Math.pow(j, basamak);
        }
        if( n == top){
            System.out.println(n+" An Armstrong number");
        }else{
            System.out.println(n+" Not an Armstrong number.");
        }
   }   
}
