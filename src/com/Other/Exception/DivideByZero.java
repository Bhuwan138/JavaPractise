package com.Other.Exception;

class InvalidNumnatorException extends Exception{
    public InvalidNumnatorException(String message){
        super(message);
    }
}


public class DivideByZero {
    public static void main (String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            if (a<=0){
                InvalidNumnatorException obj = new InvalidNumnatorException("Numnator Must be Positive");
                throw obj;
            }
            int div = a/b;
            System.out.println("Division is : " + div);
        }
        catch (InvalidNumnatorException iNE){
            System.out.println(iNE);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Author : @Bhuwan Raj Pandey");
        }
    }
}
