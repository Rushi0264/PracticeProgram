package Array;

public class FirstArrayProgram {
    public static void main(String[] args) {
        //syntax 1
        //datatype reference[] = new datatype[size of array];
        int marks[]=new int[5];
        //reference[indexNum]=value;
        marks[0]=70;
        marks[1]=87;
        marks[2]=56;
        marks[3]=78;
        marks[4]=76;

        System.out.println("Marks of English : "+marks[0]);
        System.out.println("Marks of Math : "+marks[1]);
        System.out.println("Marks of Physics : "+marks[2]);
        System.out.println("Marks of Chemistry : "+marks[3]);
        System.out.println("Marks of Biology : "+marks[4]);

        /*Q.1.Declare an integer array named numbers of size 5 and initialize it with values 10, 20, 30, 40, and 50. Then,
              print the element at index 2.*/

        int number[]=new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;

        System.out.println("\n\nIndex 2 value is : "+number[2]);

        //syntax2

    }
}
