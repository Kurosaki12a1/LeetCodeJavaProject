
class ValidPalindrome {

    // Given a string, determine if it is a palindrome
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
       System.out.println("The Result is: " + result);
    }

    public static boolean isPalindrome(String s) {
        String realString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left, right;
        left = 0;
        right = realString.length() - 1;
        
        while (left < right) {
            if (realString.charAt(left) != realString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
