package Basics;
import java.util.*;
public class condition3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1=sc.nextInt();
         System.out.print("Enter number 2:");
        int num2=sc.nextInt();
        if(num1==num2){
            System.out.println("num1 is equal to num2:"+num1);
        }else if(num1>num2){
            System.out.println("num1 is greater:"+num1);
        }else{
            System.out.println("num2 is greater:"+num2);
        }
    }
}
