public class ReverseNumber {
    public static void main(String[] args) {
        // Input number (you can change this value as needed)
        int number = 227688;

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        // Display the reversed number
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
