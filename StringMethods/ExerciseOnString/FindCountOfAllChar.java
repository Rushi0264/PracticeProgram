package StringMethods.ExerciseOnString;

public class FindCountOfAllChar {
    public static void main(String[] args) {
        String str = "Java Programming";

        //str=str.toLowerCase();
        str=str.replace(" ","");

        int[] freq = new int[256];

        for (int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }

        System.out.println("Frequency of char : ");
        for (int i=0; i<freq.length;i++){
            if (freq[i] > 0){
                System.out.println((char) i +" = "+freq[i]);
            }
        }
    }
}
