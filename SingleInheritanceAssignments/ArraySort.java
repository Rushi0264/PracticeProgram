package SingleInheritanceAssignments;

class sortArr{
    void sort(){
        int[] a = {2,3,4,9,7,8,1,5,6};

        for (int i=0;i<a.length; i++){
            for (int j=i+1; j<a.length; j++){
                int temp=0;
                if(a[j]<a[i]){
                    temp= a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
    }
}

public class ArraySort extends sortArr {
    public static void main(String[] args) {
        ArraySort obj = new ArraySort();
        obj.sort();
    }
}
