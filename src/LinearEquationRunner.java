import java.util.Scanner;
import java.text.DecimalFormat;
public class LinearEquationRunner {
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        //DecimalFormat decimalFormat = new DecimalFormat("0.00");
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

        //LinearEquation linEquation = new LinearEquation(numCoord1x, numCoord1y, numCoord2x, numCoord2y);

        System.out.println(numCoord1x+ numCoord1y+ numCoord2x+ numCoord2y);





    }
}
