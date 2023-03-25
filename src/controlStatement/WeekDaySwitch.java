package controlStatement;
public class WeekDaySwitch {
    public static void weekDaySelection(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); //Without Break
            case 4:
                System.out.println("Thursday"); //Without Break
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
}
    public static void main(String[] args) {
        weekDaySelection(3);
        weekDaySelection(7);
    }
}
