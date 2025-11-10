package StringMethods.ExerciseOnString;

public class CountOfAllChar {
    public static void main(String[] args) {
        String str = "Java Programming";

        //str=str.toLowerCase();
        str=str.replace(" ","");

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count=0;

            for (int j=0;j<str.length();j++){
                if (str.charAt(j) == ch){
                    count++;
                }
            }

            // print first occurrence
            if (str.indexOf(ch) == i){
                System.out.println(ch+" = "+count);
            }

            //System.out.println(ch+" = "+count);

        }
    }
}
