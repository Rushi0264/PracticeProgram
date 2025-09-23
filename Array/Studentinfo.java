package Array;

class student{
    void studentDetail(){
        int[] rollNo = {1,2,3,4,5};
        String[] stdName = {"Rushi" , "Om" , "Sumit", "Yuvraj" ,"Ganesh"};

        for (int i=0,j=0;i<rollNo.length && j<stdName.length; i++, j++){
            System.out.println("Roll number of student is "+rollNo[i]+" and Name of student is "+stdName[j]);
        }
    }
}

public class Studentinfo {
    public static void main(String[] args) {
        student s = new student();
        s.studentDetail();
    }
}
