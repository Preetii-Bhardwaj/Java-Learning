package Basics;
import java.util.*;
public class loop1 {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter your number:");
    int num=sc.nextInt();
    for(int i=0;i<num;){
        System.out.print(i +" ");
        i+=1;
    }
   } 
}
