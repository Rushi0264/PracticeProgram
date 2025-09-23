package Array;

public class ArrWithLoop {

    void arrMethod(){
        String StudentsName[]={"Rushikesh","Omkar","Sumit","Dipak","Ganesh"};

        StudentsName[2]="Tushar";//change the value of  index number 2 from sumit to tushar

        System.out.println("\nStudents Name:");
        for (int i=0; i<StudentsName.length; i++) {
            System.out.println(StudentsName[i]);
        }
        System.out.println();//this line use for take a blank line after execute the method
    }

    public static void main(String[] args) {

        ArrWithLoop obj = new ArrWithLoop();
        obj.arrMethod();

        int []array = new int[5];
        array[0]=11;
        array[1]=12;
        array[2]=13;
        array[3]=14;
        array[4]=15;
        for (int i=0; i<array.length; i++){
            System.out.println(+array[i]);
        }
        System.out.println();//this line use for take a blank line after execute the array

        String Car[]={"Dzire","Aura","Baleno","Swift","Thar","BMW"};
        System.out.println("Car Names:");
        for(int i=0; i< Car.length; i++){
            System.out.println(Car[i]);
        }


    }
}
