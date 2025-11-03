package Strings;

public class InbuiltStringMethods {
    public static void main(String[] args) {
        String firstName = "Rushikesh";
        String lastName = "Chepte";
        String fullName = firstName +" "+ lastName;

        //find length of string
        System.out.println("Length of string : "+fullName.length());

        // charAt() Returns character at specific index
        for (int i=0; i<fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }
        //specific index
        System.out.println();
        System.out.println("Specific index : "+fullName.charAt(7));

        System.out.println();
        //Compare the two strings
        String str1 = "Rushi";
        String str2 = "Rushi2";

        if (str1.compareTo(str2) == 0){
            System.out.println("Strings are equals");
        }
        else {
            System.out.println("Strings are not equal");
        }

        //get substring from string
        String name = "My name is Rushi";
        String subName = name.substring(3,7);
        System.out.println("Substring is : "+subName);
    }
}
