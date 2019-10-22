package dfloriani.dayane;

import static dfloriani.dayane.Triangle.getTriangleType;
import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int triangleType = 0;
        
        System.out.println("Enter the lenght of the first side of your triangle:");
        int side1 = keyboard.nextInt();
        
        System.out.println("Enter the lenght of the second side of your triangle:");
        int side2 = keyboard.nextInt();
        
        System.out.println("Enter the lenght of the third side of your triangle:");
        int side3 = keyboard.nextInt();
        
        triangleType = getTriangleType(side1, side2, side3);
        
        System.out.println("Triangle type: " + triangleType);
    }
    
}
