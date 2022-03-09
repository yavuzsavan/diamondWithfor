package Java;
import java.util.*;

public class Patika {
    public static String reverseString(String str){
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        return rev; 
}
    public static void main(String[] args){
        String str = "" ;
        String ch = "";

        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        
        //System.out.println(reverseString(str));
        for(int i = 0; i<str.length(); i++){
            ch = str.charAt(i) + ch;
        }
        System.out.println(ch);
    }
}
