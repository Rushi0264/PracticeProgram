package Flowcontrol;

public class SwitchCaseAssignment {
    public static void main(String[] args) {
        int month = 8;
        String RunningMonth = "";

        switch (month){
            case 1:
                RunningMonth+="January";
                break;
            case 2:
                RunningMonth+="February";
                break;
            case 3:
                RunningMonth+="March";
                break;
            case 4:
                RunningMonth+="April";
                break;
            case 5:
                RunningMonth+="May";
                break;
            case 6:
                RunningMonth+="June";
                break;
            case 7:
                RunningMonth+="July";
                break;
            case 8:
                RunningMonth+="August";
                break;
            case 9:
                RunningMonth+="September";
                break;
            case 10:
                RunningMonth+="October";
                break;
            case 11:
                RunningMonth+="November";
                break;
            case 12:
                RunningMonth+="December";
                break;
            default:
                RunningMonth+="Invalid";
                break;
        }
        System.out.println("Running month is "+RunningMonth);
    }
}
