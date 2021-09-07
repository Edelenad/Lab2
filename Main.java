class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    System.out.println(" ");
    
    
    int numTtl = 55 * 11;
    System.out.println("Total:" + numTtl);

    double numBlue;
    numBlue = numTtl * .24;
    System.out.println ("Blue:" + numBlue);

    double numBrown;
    numBrown = numTtl * .13;
    System.out.println ("Brown:" + numBrown);

    double numGreen;
    numGreen = numTtl * .16;
    System.out.println("Green:" + numGreen);

    double numOrange;
    numOrange = numTtl * .20;
    System.out.println ("Orange:" + numOrange);

    double numRed;
    numRed = numTtl * .13;
    System.out.println ("Red:" + numRed);

    double numYellow;
    numYellow = numTtl * .14;
    System.out.println ("Yellow:" + numYellow);
  
    double sum = 0;
    sum = sum += numBlue + numBrown + numGreen + numOrange + numRed + numYellow;
    System.out.println (" ");
    System.out.println ("Sum:" +sum);


    if ( numBlue < numBrown && numRed > numOrange)
     System.out.println ("Blue under Brown and Red over Orange");
if ( numBrown >= numGreen)
     System.out.println( "Brown is greater than or equal to Green");
if ( sum == numTtl)
     System.out.println ("Numbers match");









  }
}