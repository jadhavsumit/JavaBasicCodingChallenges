public class PalindromeChecker {

        String str = "racecar";

        boolean isPalindrome = isPalindrome(str);

 /*    if(isPalindrome)
    {
        System.out.println(str+ "String is palindrome");
    }else
    {
        System.out.println(str + "String is not palindrome");
    }*/

    public static boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    
}
