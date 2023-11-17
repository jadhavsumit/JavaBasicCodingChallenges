public class Palindrome {
    public static void main(String[] args) {
        String Name = "Nitin";

       String inputString = Name.toLowerCase();

       int left = 0;
       int right =inputString.length()-1;
       boolean palindrome=true;

       while (left<right)
       {
           if (inputString.charAt(left) != inputString.charAt(right)){
               palindrome=false;
               break;
           }
           left++;
           right--;
       }

        if (palindrome)
        {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }

    }
}
