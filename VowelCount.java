class vowelsCount {
    public static void main(String[] args) {

        String inputString = "I am a QA Engineer";
        int vowelCount = 0;
        // Convert the input string to lowercase to handle both uppercase and lowercase vowels
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++)
        {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}