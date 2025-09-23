package ArrayWithLoops;

public class StudentsMarks {
    public static void main(String[] args) {
        int[] marks = {55, 72, 40, 89, 65, 48, 92, 33, 75, 60};
        String studentName[] = {"Shubham","Sumit","Shreyash","Sartahak","Rushi","Avinash","Omkar","Vaibhav","Yogesh","Balaji"};
        for(int i=0;i<marks.length;i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] < marks[j]) {
                    int temp;
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
            System.out.println("Sorted marks list : ");
        for (int i=0; i< studentName.length; i++){
            System.out.println("Student name : "+studentName[i]+" and obtained marks is "+marks[i]);
        }

/*            System.out.println("Shubham : "+marks[0]);
            System.out.println("Sumit : "+marks[1]);
            System.out.println("Shreyash : "+marks[2]);
            System.out.println("Sartahak : "+marks[3]);
            System.out.println("Rushi : "+marks[4]);
            System.out.println("Avinash : "+marks[5]);
            System.out.println("Omkar : "+marks[6]);
            System.out.println("Vaibhav : "+marks[7]);
            System.out.println("Yogesh : "+marks[8]);
            System.out.println("Balaji : "+marks[9]);*/

//        System.out.println((char) 10084);
    }
}
