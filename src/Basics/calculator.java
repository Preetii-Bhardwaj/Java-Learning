package Basics;
import java.util.*;
public class calculator {
     public static void main(String  args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        int a=sc.nextInt();
        System.out.print("Enter the value:");
        int b=sc.nextInt();
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("Addition is:"+(a+b));
            break;
            case 2:System.out.println("Subraction is:"+(a-b));
            break;
            case 3:System.out.println("Multiplication is:"+(a*b));
            break;
            case 4:System.out.println("Division is:"+(a/b));
            break;
            case 5:System.out.println("Reminder is:"+(a%b));
            break;
            default:System.out.println("Wrong Choice Try Again!!!!");


        }
     }
}
 