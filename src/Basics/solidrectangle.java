package Basics;
import java.util.*;
public class solidrectangle {
    public static void main(String argd[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number:");
         int n=sc.nextInt();
         System.out.print("Enter your number:");
         int m=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
