public class Test7 {
    public static void main (String [] args){

        int weekday = 2;

        switch (weekday) {
            case 1 :
                System.out.println("Today is Monday");
                break;
            case 2 :
                System.out.println("Today is Tuesday");
                break;
            case 3 :
                System.out.println("Today is Wednesday");
                break;
            case 4 :
                System.out.println("Today is Thursday");
                break;
            case 5 :
                System.out.println("Today is Friday");
                break;
            default :
                System.out.println("Try Again");
        }   

        String day ="Sunday";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("This is a Week day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("This is a Weekend day");
                break;
            default: 
                System.out.println("Enter first letter captital");
        }

    }
}
