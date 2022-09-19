package org.example;

import java.util.ArrayList;
import java.util.Stack;

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

        System.out.println(balpar(")("));

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

    public static boolean balpar(String text){
        Stack myStack = new Stack();


        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            switch(charArray[i]){
                case '(':
                    myStack.push(charArray[i]);
                    break;
                case ')':
                    myStack.pop();
                    break;
            }
            if(myStack.empty()){
                return true;
            }

        }
        return myStack.isEmpty();
    }
}
