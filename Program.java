package aplication;

import java.util.Scanner;
import entities.Rectangle;

public class Program {
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);
        
        Rectangle rect = new Rectangle();

        System.out.println("Enter Rectangle width and height: ");
        rect.w = kb.nextDouble();
        rect.h = kb.nextDouble();

        System.out.printf("AREA = %.2f", rect.area());
    }

        System.out.printf("PERIMETER = %.2f", rect.perimenter());
        
        System.out.printf("DIAGONAL = %.2f", rect.diagonal());

        kb.close();
    }

