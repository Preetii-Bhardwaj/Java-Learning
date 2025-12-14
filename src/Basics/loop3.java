package Basics;
import java.util.*;
public class loop3 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter your number:");
        int x=sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<x);
    }
}
