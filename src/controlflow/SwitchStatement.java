package controlflow;

public class SwitchStatement {
    public static void main(String[] args) {
        int a = 6;
        switch (a) {
            case 1:
                System.out.println(a + " is equal to 1");
                System.out.println("something");
                break;
            case 2:
                System.out.println(a + " is equal to 2");
                break;
            case 3:
                System.out.println(a + " is equal to 3");
                break;
            case 4:
                System.out.println(a + " is equal to 4");
                break;
            case 5:
                System.out.println(a + " is equal to 5");
                break;
            default:
                System.out.println("Number is not found");
        }

        String day = "sun";
        switch (day) {
            case "monday":
                System.out.println("Today is Mon");
                break;
            case "tuesday":
                System.out.println("Today is Tue");
                break;
            case "wednesday":
                System.out.println("Today is Wed");
                break;
            case "thursday":
                System.out.println("Today is Thu");
                break;
            case "friday":
                System.out.println("Today is fri");
                break;
            case "saturday":
                System.out.println("Today is sat");
            default:
                System.out.println("Happy Sunday!");
        }
    }
}

//switch case