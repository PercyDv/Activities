package aplication;

import java.util.Scanner;
import entities.Rectangle;
public class Program {
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);
        
        Rectangle rectangle = new rectangle();

        System.out.println("Enter Rectangle width and heigth: ");
        rectangle.w = kb.nexDouble();
        rectangle.h = kb.nexDouble();

        System.out.printf("AREA = %.2f", rectangle.area());
    }
}
