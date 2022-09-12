package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(sum(5));

        System.out.println(evenSquares(10));

    }

    public static int sum(int n){

        if (n <= 1) {
            return n;
        }
        return n + sum(n-1);
    }



    public static int evenSquares(int n){

        if (n<=1){
            return n;
        }
        else if (n % 2 != 0){
            evenSquares(n-1);
        }
        return n*n + evenSquares(n-2);
    }
}
