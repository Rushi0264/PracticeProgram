package JavaBasicProgramPractice;

public class VariableWidningAndNarrowingPractice {

    //convert data from int to double datatype(smaller to larger data type)
   // 1. Widening (Implicit) Casting:
   // Definition: Converting a value from a smaller data type to a larger data type.
    int myInt =12;
    double myDouble=myInt;


    //convert data from byte to short(smaller to larger data type)
    byte myByte=123;
    short myShort = myByte;


    //convert data from double to int and double to byte but it not safe
    //2. Narrowing (Explicit) Casting:
   // Definition: Converting a value from a larger data type to a smaller data type.
   double dd=8589;
   int ii=(int)dd;
   byte bb=(byte)dd;

   int a=1234567890;
   byte b= (byte) a;

//
    //long to short
    long ll=123456789;
    short ss=(short)ll;


    public static void main(String[] args) {
        double dd=8589;
       int ii=(int)dd;
        System.out.println(ii);

        int myintt=1234567890;
        byte myByte=(byte) myintt; //here we loss the data
        System.out.println(myByte);


        int myInt=21;
        double myDouble = myInt;
        System.out.println(myDouble);

        long ll=123456789;
        short ss=(short)ll;
        System.out.println(ss);


    }
}
