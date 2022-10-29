import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String[] arg){
        //gets user input for the two coords. Must be in format (num, num)
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 1: ");
        String coord2 = scan.nextLine();

        //finds the parenthesis and commas to separate nums from the string
        int middle1 = coord1.indexOf(",");
        int middle2 = coord2.indexOf(",");
        int openPar1 = coord1.indexOf("(");
        int openPar2 = coord2.indexOf("(");
        int closePar1 = coord1.indexOf(")");
        int closePar2 = coord2.indexOf(")");

        //gets the acc values by using substrings
        String coord1x = coord1.substring(openPar1+1, middle1);
        String coord1y = coord1.substring(middle1+2, closePar1);

        String coord2x = coord2.substring(openPar2+1, middle2);
        String coord2y = coord2.substring(middle2+2, closePar2);

        //changes to an int
        int x1 = Integer.parseInt(coord1x);
        int y1 = Integer.parseInt(coord1y);
        int x2 = Integer.parseInt(coord2x);
        int y2 = Integer.parseInt(coord2y);

        //checks if it is a vertical line, if not performs everything that needs to be done.
        //if it is a vertical line, prints the vertical line and that is the end of program.
        if (x1 == x2){
            System.out.println("These points are on a vertical line: x = " + x1);
        } else{
            LinearEquation linEquation = new LinearEquation(x1, y1, x2, y2); //creates object
            System.out.println("");
            System.out.println(linEquation.lineInfo());
            System.out.println("");
            System.out.print("Enter a value for x: ");
            double xValue = scan.nextDouble();
            System.out.println("");
            System.out.println(linEquation.coordinateForX(xValue));
        }

    }
}
