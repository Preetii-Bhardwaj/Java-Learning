package Basics;
import java.util.*;
public class hollowrectangle {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your number:");
        int a=sc.nextInt();
        System.out.print("Enter your number:");
        int b=sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
