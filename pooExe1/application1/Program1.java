package application1;

import java.util.Locale;
import java.util.Scanner;

import entities1.Rectangle;

public class Program1 {
    
    public static void main (String [] args) {
    	Locale.setDefault(Locale.US);
        Scanner kb = new Scanner (System.in);

        System.out.println("Enter Rectangle width and height: ");
        Rectangle.w = kb.nextDouble();
        Rectangle.h = kb.nextDouble();

        System.out.printf("AREA = %.2f%n", Rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", Rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", Rectangle.diagonal());

        kb.close();
    }
}