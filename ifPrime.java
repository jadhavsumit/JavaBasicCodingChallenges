public class ifPrime {

    public static void main(String[] args) {
        // Input number (you can change this value as needed)
        int number = 16;

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If the number is divisible by any other number, it's not prime
            }
        }

        return true; // If no divisor is found, the number is prime
    }
}
