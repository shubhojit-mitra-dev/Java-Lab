public class Lab2 {

    public static double TriangleArea(double base, double height) {
        return (0.5*base*height);
    }

    public static String PosNegOrZero(double num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    } 

    public static int DaysInMonth(int month, int year) {
        // if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
        //     return 31;
        // } else if {
        // 
        // }


        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return checkLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    public static int countDaysSince2000(int day, int month, int year) {
        int totalDays = -1;

        for (int y = 2000; y < year; y++) {
            totalDays += checkLeapYear(y) ? 366 : 365;
        }

        for (int m = 1; m < month; m++) {
            totalDays += DaysInMonth(m, year);
        }

        totalDays += day;

        return totalDays;
    }

    public static int CountDate(int date) {
        // Date - DDMMYYYY
        
        int day = date / 1000000;
        int month = (date / 10000) % 100;
        int year = date % 10000;

        if (month > 12 || day < 1 || day > DaysInMonth(month, year)) {
            return -1;
        } else {
            int days = countDaysSince2000(day, month, year);
            return days;
        }
    }


    public static void main(String[] args) {
        System.out.println(TriangleArea(15,30));
        System.out.println(PosNegOrZero(32));
        System.out.println(CountDate(10012005));
    }
}