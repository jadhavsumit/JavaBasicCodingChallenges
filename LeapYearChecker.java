public class LeapYearChecker {
    public static void main(String[] args) {
        // Input year (you can change this value as needed)
        int year = 2023;

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    // Function to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        // Leap year if divisible by 4
        // Exception: Years divisible by 100 are not leap years unless they are also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
