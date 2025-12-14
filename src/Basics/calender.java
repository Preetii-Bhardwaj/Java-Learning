package Basics;
import java.util.*;
public class calender {
   public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Entrez votre choix:");
    int choice=sc.nextInt();
    switch(choice){
        case 1:System.out.println("Janvier");
        break;
        case 2:System.out.println("février");
        break;
        case 3:System.out.println("Mars");
        break;
        case 4:System.out.println("Avril");
        break;
        case 5:System.out.println("Mai");
        break;
        case 6:System.out.println("Juin");
        break;
        case 7:System.out.println("Juillet");
        break;
        case 8:System.out.println("août");
        break;
        case 9:System.out.println("septembre");
        break;
        case 10:System.out.println("Octobre");
        break;
        case 11:System.out.println("Novembre");
        break;
        case 12:System.out.println("Décembre");
        break;
        default:System.out.println("essayer à nouveau");
    }
   } 
}
