package constructor;

class rollNo{
    String[] name = {"Rushi", "Om", "Chandrakant", "Sumit", "Yuvraj"};
    int[] rNo = {1,2,3,4,5};
    rollNo() {
        for (int i = 0,j=0 ; i < name.length && j<rNo.length; i++,j++) {
            System.out.println("Student name is : " + name[i] + " roll number is : " + rNo[j]);
        }
    }
}

public class studentInfo extends rollNo{
    studentInfo(){
        System.out.println("This is student information..!");
    }
    public static void main(String[] args) {
        studentInfo obj = new studentInfo();
    }
}
