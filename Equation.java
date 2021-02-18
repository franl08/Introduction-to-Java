import java.lang.Math; 

public class Equation {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        solver(a,b,c);
    }
    public static void solver(int a, int b, int c){
        double r1, r2, bin, squareB, a1, b1, c1;
        a1 = (double) a;
        b1 = (double) b;
        c1 = (double) c;
        squareB = square(b1);
        bin = squareB - (4 * a1 * c1);
        if (bin < 0){
            System.out.println ("Impossible equation in R");
        } 
        else if (a1 == 0 && b1 != 0 && c1 != 0){
            r1 = (-c1) / b1;
            System.out.println("x = " + r1);
        }
        else if (a1 != 0 && b1 == 0 && c1 == 0 || a1 == 0 && b1 != 0 && c1 == 0){
            System.out.println("x = 0");
        }
        else if (a1 == 0 && b1 == 0){
            System.out.println("Not an equation");
        }
        else {
            r1 = (-b1 - Math.sqrt((squareB - (4 * a1 * c1)))) / (2 * a1);
            r2 = (-b1 + Math.sqrt((squareB - (4 * a1 * c1)))) / (2 * a1);
            System.out.println("x = " + r1 + " or " + "x = " + r2);       
        }
    }

    public static double square (double b){
        return (b * b);
    }
}
