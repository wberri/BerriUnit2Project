import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 1: ");
        String coord2 = scan.nextLine();

        int middle1 = coord1.indexOf(",");
        int middle2 = coord2.indexOf(",");
        int openPar1 = coord1.indexOf("(");
        int openPar2 = coord2.indexOf("(");
        int closePar1 = coord1.indexOf(")");
        int closePar2 = coord2.indexOf(")");

        String coord1x = coord1.substring(openPar1+1, middle1);
        String coord1y = coord1.substring(middle1+2, closePar1);

        String coord2x = coord2.substring(openPar2+1, middle2);
        String coord2y = coord2.substring(middle2+2, closePar2);

        int numCoord1x = Integer.parseInt(coord1x);
        int numCoord1y = Integer.parseInt(coord1y);
        int numCoord2x = Integer.parseInt(coord2x);
        int numCoord2y = Integer.parseInt(coord2y);


        if (numCoord1x == numCoord2x){
            System.out.println("These points are on a vertical line: x = " + numCoord1x);
        } else{
            LinearEquation linEquation = new LinearEquation(numCoord1x, numCoord1y, numCoord2x, numCoord2y);
            //System.out.println(linEquation.roundedToHundredth(3.12345));
            //System.out.println(linEquation.distance());
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
