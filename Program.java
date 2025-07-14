package aplication;

import java.util.Scanner;
import entities.Rectangle;
public class Program {
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);
        
        Rectangle rect = new rectangle();

        System.out.println("Enter Rectangle width and heigth: ");
        rect.w = kb.nextDouble();
        rect.h = kb.nextDouble();

        System.out.printf("AREA = %.2f", rect.area());
    }
}
