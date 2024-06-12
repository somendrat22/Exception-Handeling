public class Main {
    public static void fun() throws ArithmeticException{
        int a = 10/9;
    }

    public static void main(String[] args) {
        // Can we handle error ?
        // After Java version 9 we are able to handle error also
        // throw : It helps you to throw error or exception manually by yourself
        // throws : Which tells developer that a function might can throw some kind of exception
        int val1 = 10;
        int val2 = 0;
        // int a = val1/val2;
        try{
            fun();
        }catch(ArithmeticException e){
            System.out.println("Catched exception");
        }catch(ArrayIndexOutOfBoundsException som){
            System.out.println(som.getMessage());
        }catch (Error e){

        }
        System.out.println("Hey we are running other lines");
    }


}