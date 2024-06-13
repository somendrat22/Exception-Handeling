import java.util.Scanner;

public class Main {


    public static void run() throws ArithmeticException{

            int a = 10/0;


    }

    static {

    }

    public static void fun() throws ArithmeticException{
        int a = 10/9;
    }



    public static void hey() throws WrongCredentialsException{
       if(2 + 2 == 4)
            throw new WrongCredentialsException("Hey");
    }
    public static void main(String[] args) throws WrongCredentialsException{

        // variables and constants
        // variables are something whoose value can get changed
        // constants are something whoose value are fixed
        // We use final keyword to make constants.
        // Compile time exception -> Checked exceptio
        // Runtime exception -> Unchecked exception

        try{
            run();
        }catch (ArithmeticException e){

        }

        // Can we handle error ?
        // After Java version 9 we are able to handle error also
        // throw : It helps you to throw error or exception manually by yourself
        // throws : Which tells developer that a function might can throw some kind of exception
//        int val1 = 10;
//        int val2 = 0;
        // int a = val1/val2;
//        try{
//            throw new UserNotExistException("hey how are you ?");
//        }catch(ArithmeticException e){
//            System.out.println("Catched exception");
//        }catch(ArrayIndexOutOfBoundsException som){
//            System.out.println(som.getMessage());
//        }catch (Error e){
//
//        }
        throw new ArrayIndexOutOfBoundsException("throwing for fun");
//        Scanner scn;
//        try{
//          int a = 10/9;
//          scn = new Scanner(System.in);
//          System.out.println("All lines inside try block got exceuted");
//        }catch (ArithmeticException e){
//           System.out.println("Exception catched");
//        }finally {
//            System.out.println("Hey in finally");
//            // It is always going to run either the exception arises or exception didn't
//            // Database co
//            scn.close();
//        }

        // finally is a block
        // if else block

//        final int a = 10;
        // final keyword with variable -> final keyword
        //System.out.println("Hey we are running other lines");
    }


}