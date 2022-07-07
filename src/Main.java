import org.w3c.dom.ls.LSOutput;

public class Main {



    public static void main(String[] args) {

//      NUMBERS
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 37687;
        long myLong = 8786786L;
        float myFloat = 68687f;
        double myDouble = 2.5;

//      SYMBOLS
        char myChar = '7';
        String myString = "you can write here anything you want &*&(*";

//      BOOLEAN
        boolean myBoolean = true;
        boolean myBoolean2 = false;

//      sout
//        System.out.println(myByte);
//        System.out.println(myShort);
//        System.out.println(myInt);
//        System.out.println(myLong);
//        System.out.println(myFloat);
//        System.out.println(myDouble);
//        System.out.println(myChar);
//        System.out.println(myString);
//        System.out.println(myBoolean);
//        System.out.println(myBoolean2);

//      OPERATORS

        int x = 3;
        int y = 2;
        x = y;

//        System.out.println(x + y);
//        System.out.println(x - y);
//        System.out.println(x * y);
//        System.out.println(x / y);
//        System.out.println(x + x + x + y);
//        System.out.println((x + y) * y);

        int sum = x + y;
        int sub = x - y;
        int mult = x * y;
        int div = x / y;
//        System.out.println(sum);
//        System.out.println();
        y = 7;
//        System.out.println(y);

        int x1 = 2;
        int x2 = 2;

//        System.out.println(x1 == x2);
//        System.out.println(x1 != x2);
//        System.out.println(x1 > x2);
//        System.out.println(x1 >= x2);
//        System.out.println(x1 < x2);
//        System.out.println(x1 <= x2);

        boolean answer = (x1 == x2);

        int x3 = 3;
        double x4 = 2.5;

//        System.out.println(x3 + x4);
        double result = x3 + x4;

        String s1 = "Hello";
        String s2 = " You";
        System.out.println(s1 + s2);
        String s3 = s1 + s2;

        char c1 = 'a';
        char c2 = 'b';
        System.out.println(c1 + c2);

        System.out.println("x = " + x3); //  x = 3
    }



}


