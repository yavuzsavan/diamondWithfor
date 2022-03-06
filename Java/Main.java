package Java;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int age, km, type;
        double price=0, discount, discountRatio, roundRatio = 0.2, perKm = 0.1;
        boolean isValid = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("How much km: ");
        km = sc.nextInt();

        System.out.print("\nYour age: ");
        age = sc.nextInt();

        System.out.print("\n1=>One Way, 2=>Round Trip : ");
        type = sc.nextInt();

        if(km >0){
        price = km*perKm;
        }
        else{
            isValid= true;
        }
        if(0<age && age <12){
            discountRatio= 0.5;
            discount = price*discountRatio;
            price -= discount;
            if(type == 2){
                discount = 0;
                discount = price*roundRatio;
                price = (price - discount)*2;
            }
            else if(type == 1){
                price*= 1;
            }
            else{
                isValid= true;
            }
        }
        else if(12<=age && age<24){
            discountRatio = 0.1;
            discount = price*discountRatio;
            price -= discount;
            if(type == 2){
                discount =0;
                discount = price*roundRatio;
                price = (price - discount)*2;
            }
            else if(type == 1){
                price*= 1;
            }
            else{
                isValid= true;
            }
        }
        else if(24<=age && age<65){
            price*= 1;
            if(type == 2){
                discount = 0;
                discount = price*roundRatio;
                price = (price - discount)*2;
            }
            else if(type == 1){
                price*= 1;
            }
            else{
                isValid= true;
            }
        }
        else if(age>=65){
            discountRatio = 0.3;
            discount = price*discountRatio;
            price -= discount;
            if(type == 2){
                discount = 0;
                discount = price*roundRatio;
                price = (price - discount)*2;
            }
            else if(type == 1){
                price*= 1;
            }
            else{
                isValid= true;
            }
        }
        if(isValid){
            System.out.println("Invalid Character");
        }
        else{
            System.out.println("Age: "+age+ "\nKm: "+km+ "\nType: "+type+ "\nPrice: "+price+"TL");
        }

    }
}