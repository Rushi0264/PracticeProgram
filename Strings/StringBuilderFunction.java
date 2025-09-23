package Strings;

public class StringBuilderFunction {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rushi");
        System.out.println(sb);

        //Char at index 0
        System.out.println(sb.charAt(0));

        //set new char at index 0
        /*sb.setCharAt(0,'V');
        System.out.println(sb);*/    //Vushi

        //insert new char before index 0
        sb.insert(0, 'A');
        System.out.println(sb);//ARushi

        //insert new char before index 1
        sb.insert(1, 'a');
        System.out.println(sb);//AaRushi

        //delete the extra n
        sb.delete(0,2);
        System.out.println(sb);

    }
}
