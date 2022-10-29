public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    //constructor, four parameters
   public LinearEquation(int x1, int y1, int x2, int y2){
       this.x1 = x1;
       this.x2 = x2;
       this.y1 = y1;
       this.y2 = y2;
   }

    //distance method, returns distance between the two points
    public double distance(){
        double distance = Math.sqrt((Math.pow((double)(y2-y1),2.0) + Math.pow((double)(x2-x1),2)));
        return roundedToHundredth(distance);
    }

    //yIntercept method, returns y int of line, but always a double
    public double yIntercept(){
        double yInt = (double)y2-(slope()*(double)x2);
        return roundedToHundredth(yInt);
    }

    //slope method, returns the slope of line as a double
    public double slope(){
        double changeInY = (double)(y2-y1);
        double changeInX = (double)(x2-x1);
        return roundedToHundredth(changeInY/changeInX);
    }

    //equation method, returns the equation with all specifications
    //I decided to use concatenation, so the first section is for the slope and x, and the second part is for the y int.
    public String equation() {
        int changeInY = y2-y1;
        int changeInX = x2-x1;
        String equation = "y = " + changeInY + "/" + changeInX;

        if (changeInX == -(changeInY)) {
            equation = "y = -x"; //if slope is -1
        } else if (changeInX == changeInY) {
            equation = "y = x"; //if slope is +1
        } else if (changeInY == 0.0){
            equation = "y = "; //if there is no slope
        }else if (changeInY%changeInX == 0) {
            equation = "y = " + changeInY/changeInX + "x"; //if slope is a whole num
        }else if (changeInY<0){
            if (changeInX<0){
                equation = "y = " + Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x"; //if both are negative, gets rid of sign
            } //if not, it will keep equation as is which is for if both are positive
        } else if (changeInX<0){ //if only change in x is negative, it moves the negative to front
            equation = "y= -" + changeInY + "/" + Math.abs(changeInX) + "x";

        }else{
            equation += "x"; //puts an x after slope of the original equation
        }

        //for y int
        if (equation.indexOf("x") ==-1){
            equation+= y2; //adds y int if there was no slope
        } else if(yIntercept()==0.0) {
            equation+= ""; //makes sure nothing is printed for if y int is 0
        } else if(yIntercept()<0){
            equation+= " - " + Math.abs(yIntercept()); //spaces the minus if y int is less than 0
        }else {
            equation+= " + " + yIntercept(); //adds the plus sign if y int is greater than 0
        }
        return equation;
    }

    //returns a string with the point given the x value
    public String coordinateForX(double xValue) {
        double yValue = xValue * slope();
        yValue += yIntercept();
        return "The point on the line is " + "(" + roundedToHundredth(xValue) + ", " + roundedToHundredth(yValue) + ")";
    }

    //rounds to hundredths (used all throughout the methods)
    public double roundedToHundredth(double toRound){
        double round = (Math.round(toRound*100.0))/100.0;
        return round;
    }

    //returns all line info
    public String lineInfo() {
        return "The original points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " +y2 + ") \nThe equation of the line between these points is: " + equation() + "\nThe slope of this line is: " + slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the two points is: " + distance();
    }
//done

}
