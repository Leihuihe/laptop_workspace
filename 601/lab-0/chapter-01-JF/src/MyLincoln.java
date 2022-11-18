//********************************************************************
//  Lincoln.java       Java Foundations
//
//  Demonstrates the basic structure of a Java application.
//********************************************************************

public class MyLincoln
{
    //-----------------------------------------------------------------
    //  Prints a presidential quote.
    //-----------------------------------------------------------------
    public static void main(String[] args)
    {
        StdOut.println("A quote by Abraham Lincoln:");

        StdOut.println("Whatever you are, be a good one.");
        
        StdOut.println ("Enter your name: ");
        
        String myName = StdIn.readLine();
        
        StdOut.print("Your name is ");
        
        StdOut.println (myName);
    }
}
